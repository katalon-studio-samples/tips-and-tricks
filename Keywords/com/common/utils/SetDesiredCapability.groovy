package com.common.utils

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.firefox.internal.ProfilesIni
import org.openqa.selenium.ie.InternetExplorerDriver
import org.openqa.selenium.remote.DesiredCapabilities

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType

public class SetDesiredCapability {
	static KeywordLogger logger = new KeywordLogger()

	@Keyword
	def chrome(List desiredCapabilities) {
		WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()
		switch(executedBrowser) {
			case WebUIDriverType.CHROME_DRIVER:
				System.setProperty("webdriver.chrome.driver", DriverFactory.getChromeDriverPath())
				ChromeOptions options = new ChromeOptions()
			//Set desired capabilities for Chrome
				for (item in desiredCapabilities) {
					logger.logInfo("Add " + item + " to Chrome")
					options.addArguments(item)
				}
				WebDriver driver = new ChromeDriver(options)

			//Change current browser's driver using new desired capabilities
				DriverFactory.changeWebDriver(driver)
				break
		}
	}

	@Keyword
	def static firefox(def desiredCapabilities)
	{
		WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()
		switch (executedBrowser) {
			case WebUIDriverType.FIREFOX_DRIVER:
				ProfilesIni profile = new ProfilesIni()
				FirefoxProfile FF = new FirefoxProfile()
				for (item in desiredCapabilities){

					FF.setPreference(item.key , item.value)
				}
				FirefoxOptions options = new FirefoxOptions().setProfile(FF)
				System.setProperty("webdriver.gecko.driver", DriverFactory.getGeckoDriverPath())
				WebDriver driver = new FirefoxDriver(options)

			//Change current browser's driver using new desired capabilities
				DriverFactory.changeWebDriver(driver)
				break
		}
	}

	@Keyword
	def static ie(def desiredCapabilities)
	{
		DesiredCapabilities dc
		WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()
		switch (executedBrowser) {
			case WebUIDriverType.IE_DRIVER:
				System.setProperty("webdriver.ie.driver", DriverFactory.getIEDriverPath())
				for (item in desiredCapabilities) {
					logger.logInfo("Add " + item + " to Chrome")
					dc.setCapability(item.key, item.value)
				}

				WebDriver driver = new InternetExplorerDriver(dc)
			//Change current browser's driver using new desired capabilities
				DriverFactory.changeWebDriver(driver)
				break
		}
	}
}
