import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.exception.StepErrorException
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.callTestCase(findTestCase('Simple Examples/Login Test/Test data from GlobalVariable examples/Login with username and password specified in GlobalVariable'), 
    [:], FailureHandling.STOP_ON_FAILURE)

throw new StepErrorException('The test case is forced to stop here!')

println 'This message will never be printed'