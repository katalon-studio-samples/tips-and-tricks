import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Simple Examples/Login Test/Test data from GlobalVariable examples/Login with username and password specified in GlobalVariable'), 
    [:], FailureHandling.STOP_ON_FAILURE)

// Create a new TestObject and verify the present text
TestObject to = new TestObject()
to.addProperty('xpath', ConditionType.EQUALS, './/div[@class=\'aui-page-header-main\']')

WebUI.verifyElementText(to, 'System dashboard')

