import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


List desiredCapabilities = []
desiredCapabilities.add("--start-maximized")
desiredCapabilities.add("--disable-infobars")
CustomKeywords.'com.common.utils.SetDesiredCapability.chrome'(desiredCapabilities)
WebUI.navigateToUrl('https://katalon.com/')
WebUI.closeBrowser()
