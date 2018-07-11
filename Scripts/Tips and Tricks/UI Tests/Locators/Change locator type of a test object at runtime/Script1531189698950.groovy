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

// This verification should be failed due to wrong css 'your_desired_value'
WebUI.verifyElementPresent(to, 0)

