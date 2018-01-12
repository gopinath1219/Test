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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI



public class Search {
	
		
	@Keyword
	public void multiple(String name,String portCode) throws Throwable
	{
		popUp(name)
		WebUI.waitForElementClickable(findTestObject('MQ/Port_Country_Search/selectRow'), 30)
		
		String[] portList = portCode.split(",");		
		for (String PORTS : portList)
		{
			System.out.println(PORTS);
			// Inside the popup key in the PORT name -->1st Port
			
			WebUI.setText(findTestObject('MQ/Port_Country_Search/search_port_or_country'), PORTS)
			wait_FOR_ports(PORTS)								
			WebUI.click(findTestObject('MQ/Port_Country_Search/selectRow'))
			Thread.sleep(250);
			WebUI.setText(findTestObject('MQ/Port_Country_Search/search_port_or_country'), '')
			Thread.sleep(250);
			
		}
		
		WebUI.click(findTestObject('MQ/Port_Country_Search/Associate'))
		System.out.println("*******DONE********");
		//Thread.sleep(1000L);
	}


	//********************************************************Wait for port name***************************************************************	
	private String getPortXpath(String PORTS){
		return "//td[@title='"+PORTS+"']"
	}
	
	// xpath will get generated during the run time
	// I need to create test object during run time
	// For creating test object one can use TestObject class
	
	private TestObject getPortTestObject(String menuName){
		TestObject port = new TestObject(menuName);
		port.addProperty("xpath", ConditionType.EQUALS, getPortXpath(menuName), true);
		System.out.println("Xpath : " + getPortXpath(menuName))
		return port
	}
	
	
	public void wait_FOR_ports(String menuName){
		TestObject PORT = getPortTestObject(menuName)
		WebUI.waitForElementVisible(PORT, 30)
		//WebUI.click(menuItem)
		//WebUI.delay(1)
	}
	
	
	
//********************************************************P O P - U P******************************************************************
	private String getPopUpItem_Xpath(String xpath){
		return "//button[@id='PWCMasterPage_PWCWebPartManager_gwpMQCarrierRateSearchFr_MQCarrierRateSearchFr_txt"+xpath+"_btnPopup']"
	}
	
	// xpath will get generated during the run time
	// I need to create test object during run time
	// For creating test object one can use TestObject class
	
	private TestObject getPopupTestObject(String popup_NAME){
		TestObject popUp_ITEM = new TestObject(popup_NAME);
		popUp_ITEM.addProperty("xpath", ConditionType.EQUALS, getPopUpItem_Xpath(popup_NAME), true);
		System.out.println("Xpath : " + getPopUpItem_Xpath(popup_NAME))
		return popUp_ITEM
	}
	
	
	// Click the search popup
	public void popUp(String name){
		TestObject POP_UP = getPopupTestObject(name)
		WebUI.waitForElementVisible(POP_UP, 30)
		WebUI.click(POP_UP)
		//WebUI.delay(1)
	}
	
//************************************************************************************************************************************
	
	/*CustomKeywords.'fn.Search.multiple'("OriginPort",  portOfLoading)
	CustomKeywords.'fn.Search.multiple'("OriginCountry",  "IN,DE,AE,CN")
	CustomKeywords.'fn.Search.multiple'("DestinationPort", "DEHAM,BEANR,CLVAP")
	CustomKeywords.'fn.Search.multiple'("DestinationCountry", "DE,BE,CN")*/


}
