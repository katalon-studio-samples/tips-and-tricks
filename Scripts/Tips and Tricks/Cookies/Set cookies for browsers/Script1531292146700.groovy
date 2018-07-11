import org.openqa.selenium.Cookie
import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

Cookie ck = new Cookie("name", "value");
WebDriver driver = DriverFactory.getWebDriver()
driver.manage().addCookie(ck)