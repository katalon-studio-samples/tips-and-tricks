package com.jqueryui.widgets

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

class Selectmenu {

	def label, item

	Selectmenu() {}

	def selectItem() {
		WebUI.click(null)
	}

	def open_list() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/jqueryui/widgets/selectmenu/input', [('label') : label]), 0)
		WebUI.click(findTestObject('Object Repository/jqueryui/widgets/selectmenu/input', [('label') : label]))
	}

	def select_item() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/jqueryui/widgets/selectmenu/item', [('label') : label, ('item') : item]), 0)
		WebUI.click(findTestObject('Object Repository/jqueryui/widgets/selectmenu/item', [('label') : label, ('item') : item]))
	}

	@Keyword
	def selectItem(String label, String item) {
		def select = new Selectmenu(label : label, item : item)
		select.open_list()
		select.select_item()
	}
}
