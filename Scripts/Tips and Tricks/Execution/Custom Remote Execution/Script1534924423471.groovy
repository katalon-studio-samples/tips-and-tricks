import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.constants.StringConstants
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.driver.MobileDriverType
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.android.AndroidDriver
import groovy.json.JsonSlurper


'''Prerequisites:
1. Use default Remote settings: https://docs.katalon.com/display/KD/Desired+Capabilities
2. Use custom Remote settings: Create a custom execution first https://docs.katalon.com/display/KD/Execution+Settings#ExecutionSettings-CustomExecution
'''

String settingsPath = ""
if (GlobalVariable.customExecutionName == 'default')
{
	'Uses default Remote settings'
	settingsPath = RunConfiguration.getProjectDir() + '/settings/internal/com.kms.katalon.core.webui.remote.properties'
}
else
{
	'Uses custom execution settings based on its name (https://docs.katalon.com/display/KD/Execution+Settings#ExecutionSettings-CustomExecution)'
	settingsPath = RunConfiguration.getProjectDir() + '/settings/external/execution/' + GlobalVariable.customExecutionName + '/com.kms.katalon.core.webui.remote.properties'
}

def remoteContents = new File(settingsPath).text
def json = new JsonSlurper().parseText(remoteContents)

'Set desired capabilities'
DesiredCapabilities capabilities = new DesiredCapabilities()
json.REMOTE_WEB_DRIVER.each { key, value ->
	if ("$key" != 'remoteWebDriverUrl' && "$key" != "remoteWebDriverType")
	{
		KeywordUtil.logInfo("Using " + "$key with value is: $value")
		capabilities.setCapability("$key", "$value")
	}

}

'Create a Katalon-like mobile session'
AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(json.REMOTE_WEB_DRIVER.remoteWebDriverUrl))

'Call Mobile keywords normally from this step'
assert Mobile.getDeviceOS() != null
 
Mobile.closeApplication()