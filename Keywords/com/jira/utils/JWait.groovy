package com.jira.utils

import static java.util.concurrent.TimeUnit.*

import org.openqa.selenium.NotFoundException
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.FluentWait
import org.openqa.selenium.support.ui.Wait

import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable


public class JWait {

	public static WebDriver driver = DriverFactory.getWebDriver();

	public static Wait<WebDriver> wait = new FluentWait<>(driver)
	.withTimeout(GlobalVariable.element_timeout, SECONDS)
	.pollingEvery(1, SECONDS)
	.ignoring(NotFoundException.class)
	.withMessage("Waiting for... ");
}
