package fn

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
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

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class Select {
	
	
	@Keyword
	public static void Customer(){
		
		WebUI.waitForPageLoad(300)
		
		WebUI.delay(1)
		
		WebUI.scrollToElement(findTestObject('MQ/QuoteSummaryPage/btn_CustomerNamePopup'), 60)		
		
		WebUI.click(findTestObject('MQ/QuoteSummaryPage/btn_CustomerNamePopup'))
		
		WebUI.setText(findTestObject('MQ/QuoteSummaryPage/searchAddress'), 'z AES TEST STAKEHOLDER')
		
		WebUI.sendKeys(findTestObject('MQ/QuoteSummaryPage/searchAddress'), Keys.chord(Keys.ENTER))		
			
		WebUI.waitForPageLoad(300)
		
		WebUI.delay(2)
		
		WebUI.waitForElementPresent(findTestObject('MQ/QuoteSummaryPage/selectAddress'), 30)
		
		WebUI.waitForElementClickable(findTestObject('MQ/QuoteSummaryPage/selectAddress'), 60)
		
		WebUI.click(findTestObject('MQ/QuoteSummaryPage/selectAddress'))
	}

}
