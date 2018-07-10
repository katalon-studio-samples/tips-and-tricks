import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.SelectorMethod
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.waitForElementVisible(findTestObject('Test Objects/Pages/Login Page/elHeader'), 60)

WebUI.verifyTextPresent('Log in to your account', false)

WebUI.setText(findTestObject('Test Objects/Pages/Login Page/elUsername'), 'demo@katalon.com')

WebUI.click(findTestObject('Test Objects/Pages/Login Page/elContinue'))

WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Login Page/elEmail'), 0)

// Get the TestObject
TestObject to = findTestObject('Test Objects/Pages/Login Page/elEmail')

//Change value of CSS selector
to.setSelectorValue(SelectorMethod.CSS, 'your_desired_value')

//Change selection method from another selector to CSS selector
to.setSelectorMethod(SelectorMethod.CSS)

// This verification still pass because of using original locator
WebUI.verifyElementPresent(findTestObject('Test Objects/Pages/Login Page/elEmail'), 0)

try {
	// This verification should be failed due to wrong css 'your_desired_value'
	WebUI.verifyElementPresent(to, 0)
} catch (Exception e) {
	println '====>' + e.message
}

to = WebUI.modifyObjectProperty(findTestObject('Test Objects/Pages/Login Page/elEmail'), 'css', 'equals', 'input[name=\'loginfmt\']', true)

// This verification still pass because of using updated locator
WebUI.verifyElementPresent(to, 0)

