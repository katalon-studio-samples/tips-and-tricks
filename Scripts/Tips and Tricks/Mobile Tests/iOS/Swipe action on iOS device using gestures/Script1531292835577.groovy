import org.openqa.selenium.JavascriptExecutor

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory

JavascriptExecutor js = (JavascriptExecutor) MobileDriverFactory.getDriver()
HashMap<String, String> scrollObject = new HashMap<String, String>()
scrollObject.put("direction", 'left')
js.executeScript("mobile: swipe", scrollObject)