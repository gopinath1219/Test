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

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import codecLib.mpa.m

public class Create {
	
	@Keyword
	public static void mutiQuote(){
		
		WebUI.waitForPageLoad(300)		
		WebUI.waitForJQueryLoad(300)
		
		WebUI.waitForElementPresent(findTestObject('MQ/ListPage/btn_Create Multi-Quote'), 300)
		WebUI.waitForElementClickable(findTestObject('MQ/ListPage/btn_Create Multi-Quote'), 300)
		
		WebUI.click(findTestObject('MQ/ListPage/btn_Create Multi-Quote'))
		
		WebUI.waitForPageLoad(300)		
		WebUI.waitForJQueryLoad(300)
		
		
	}
	
	
	@Keyword
	public static void MQ_with_AgilityTariff(){
		
		WebUI.delay(2)
		
		WebUI.click(findTestObject('MQ/CarrierSearch/btn_Add_Agility_Tariff'))
		
		WebUI.waitForPageLoad(300)
		
		WebUI.waitForJQueryLoad(300)
		
		WebUI.scrollToElement(findTestObject('MQ/TariffSearch/Search_Agility_Tariff'), 30)		
		WebUI.click(findTestObject('MQ/TariffSearch/Search_Agility_Tariff'))
		
		WebUI.waitForPageLoad(300)
		
		WebUI.waitForJQueryLoad(300)
		
		WebUI.scrollToElement(findTestObject('MQ/TariffSearch/Generate_Quote_with_Agility_Tariff'), 30)
		WebUI.click(findTestObject('MQ/TariffSearch/Generate_Quote_with_Agility_Tariff'))
		
		WebUI.waitForPageLoad(300)
		
		WebUI.waitForJQueryLoad(300)
		WebUI.delay(1)
		
	}
	
	
	

}
