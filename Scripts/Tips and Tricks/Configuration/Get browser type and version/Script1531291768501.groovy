import org.openqa.selenium.Capabilities
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.RemoteWebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

WebDriver driver = DriverFactory.getWebDriver()
Capabilities caps = ((RemoteWebDriver) driver).getCapabilities()
String browserName = caps.getBrowserName().capitalize()
String browserVersion = caps.getVersion()
println browserName + ' ' + browserVersion