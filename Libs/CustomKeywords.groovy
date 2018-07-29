
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.util.List

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement


def static "com.common.utils.SetDesiredCapability.chrome"(
    	List desiredCapabilities	) {
    (new com.common.utils.SetDesiredCapability()).chrome(
        	desiredCapabilities)
}

def static "com.common.utils.SetDesiredCapability.firefox"(
    	Object desiredCapabilities	) {
    (new com.common.utils.SetDesiredCapability()).firefox(
        	desiredCapabilities)
}

def static "com.common.utils.SetDesiredCapability.ie"(
    	Object desiredCapabilities	) {
    (new com.common.utils.SetDesiredCapability()).ie(
        	desiredCapabilities)
}

def static "com.jira.components.JSelect.selectByText"(
    	TestObject o	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	o
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	String labelSelect	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	labelSelect
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	WebElement el	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	el
         , 	optionText)
}

def static "com.jira.utils.CustomGlobalVariable.addGlobalVariable"(
    	String name	
     , 	Object value	) {
    (new com.jira.utils.CustomGlobalVariable()).addGlobalVariable(
        	name
         , 	value)
}
