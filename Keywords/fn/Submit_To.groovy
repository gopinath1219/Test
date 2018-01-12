package fn

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.openqa.selenium.Keys as Keys
import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class Submit_To {
	
	@Keyword
	public static void QuoteApprover(){
		
		WebUI.waitForPageLoad(300)
		
		WebUI.scrollToElement(findTestObject('MQ/QuoteSummaryPage/btn_QuoteApproverPopup'), 60)
		
		WebUI.delay(1)
		
		WebUI.click(findTestObject('MQ/QuoteSummaryPage/btn_QuoteApproverPopup'), FailureHandling.STOP_ON_FAILURE)
		
		WebUI.setText(findTestObject('MQ/QuoteSummaryPage/searchUser'), 'topuser2_branch')
		
		WebUI.waitForPageLoad(300)
		
		WebUI.delay(1)
		
		WebUI.waitForElementPresent(findTestObject('MQ/QuoteSummaryPage/selectUser'), 30)
		
		WebUI.waitForElementClickable(findTestObject('MQ/QuoteSummaryPage/selectUser'), 60)
		
		WebUI.click(findTestObject('MQ/QuoteSummaryPage/selectUser'))
		
		WebUI.click(findTestObject('MQ/QuoteSummaryPage/btn_SubmitToQuoteApprover'))
		
		WebUI.waitForPageLoad(300)
		
		WebUI.waitForJQueryLoad(300)
		
	}

}
