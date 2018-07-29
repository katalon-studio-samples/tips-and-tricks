import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions as FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile as FirefoxProfile
import org.openqa.selenium.firefox.internal.ProfilesIni as ProfilesIni
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType as WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import com.common.utils.SetDesiredCapability

Map firefoxDC = [:]
firefoxDC.put('browser.startup.homepage' , 'https://katalon.com')
SetDesiredCapability.firefox(firefoxDC)
assert WebUI.getWindowTitle() == 'Katalon Studio: Best automated testing tool for web, mobile, API'
WebUI.closeBrowser()