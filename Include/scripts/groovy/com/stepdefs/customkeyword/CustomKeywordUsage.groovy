package com.stepdefs.customkeyword
import com.common.types.ParamTypes

import cucumber.api.java.en.Given


class CustomKeywordUsage {

	@Given("Use custom keywords in test steps")
	def I_want_to_write_a_step_with_name() {
		def my_map = new HashMap<String,String>()
		my_map.put("first name", "brian")
		my_map.put("last name", "ducson")

		ParamTypes.map_variables(my_map)
	}
}