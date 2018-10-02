package com.jqueryui.widgets

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import static java.util.Calendar.*

import org.apache.xerces.jaxp.datatype.XMLGregorianCalendarImpl.DaysInMonth

class Datepicker {

	Date date;
	TestObject obj;

	Datepicker() {}
	Datepicker(TestObject object, String input_date) {
		this.obj = object;
		date = new Date().parse("MM/dd/yyyy", input_date)
	}

	def open_calendar_form() {
		WebUI.waitForElementClickable(this.obj, 0)
		WebUI.click(this.obj)
	}

	def displaying_month() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/jqueryui/widgets/datepicker/date_month'), 0)
		return WebUI.getText(
				findTestObject('Object Repository/jqueryui/widgets/datepicker/date_month'),
				FailureHandling.STOP_ON_FAILURE)
	}

	def displaying_year() {
		WebUI.waitForElementVisible(findTestObject('Object Repository/jqueryui/widgets/datepicker/date_year'), 0)
		return WebUI.getText(
				findTestObject('Object Repository/jqueryui/widgets/datepicker/date_year'),
				FailureHandling.STOP_ON_FAILURE)
	}

	def displaying_date() {
		return new Date().parse("MMM/yyyy", displaying_month() + "/" + displaying_year())
	}

	def pick_year() {
		if (displaying_date()[YEAR] == date[YEAR]) return
			while (displaying_date()[YEAR] < date[YEAR]) {
				WebUI.click(findTestObject('Object Repository/jqueryui/widgets/datepicker/Next'))
			}
		while (displaying_date()[YEAR] > date[YEAR]) {
			WebUI.click(findTestObject('Object Repository/jqueryui/widgets/datepicker/Prev'))
		}
	}

	def pick_month() {
		if (displaying_date()[MONTH] == date[MONTH]) return
			while (displaying_date()[MONTH] < date[MONTH]) {
				WebUI.click(findTestObject('Object Repository/jqueryui/widgets/datepicker/Next'))
			}
		while (displaying_date()[MONTH] > date[MONTH]) {
			WebUI.click(findTestObject('Object Repository/jqueryui/widgets/datepicker/Prev'))
		}
	}

	def pick_day() {
		println date[DAY_OF_MONTH]
		WebUI.click(findTestObject('Object Repository/jqueryui/widgets/datepicker/date_day', [('day') : date[DAY_OF_MONTH]]))
	}

	def pick_date() {
		pick_year()
		pick_month()
		pick_day()
	}

	@Keyword
	def pickDate(TestObject ob, String date) {
		def picker = new Datepicker(ob, date)
		picker.open_calendar_form()
		picker.pick_date()
	}
}
