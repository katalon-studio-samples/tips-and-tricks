import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://jqueryui.com/selectmenu/')

CustomKeywords.'com.jqueryui.widgets.Selectmenu.selectItem'('Select a speed', 'Slow')

WebUI.verifyElementText(findTestObject('Object Repository/jqueryui/widgets/selectmenu/input', [('label') : 'Select a speed']), 'Slow')

CustomKeywords.'com.jqueryui.widgets.Selectmenu.selectItem'('Select a file', 'Some unknown file')

WebUI.verifyElementText(findTestObject('Object Repository/jqueryui/widgets/selectmenu/input', [('label') : 'Select a file']), 'Some unknown file')