package com.jira.utils

import com.kms.katalon.core.annotation.Keyword

public class CustomGlobalVariable {

	@Keyword
	void addGlobalVariable(String name, def value) {
		MetaClass mc = script.evaluate("internal.GlobalVariable").metaClass
		String getterName = "get" + name.capitalize()
		mc.static."$getterName" = { -> return value }
		//mc.static."$name" = value
	}
}
