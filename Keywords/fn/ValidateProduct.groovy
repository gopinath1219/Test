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


import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By;
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.Select;
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

public class ValidateProduct {


	WebDriver driver = DriverFactory.getWebDriver();


	@Keyword
	public void productType() throws Throwable {
		
		// This code will get the option selected in dropdown
		String productSelectedOption = new Select(driver.findElement(By.xpath("//select[@id='PWCMasterPage_PWCWebPartManager_gwpMQCarrierRateSearchFr_MQCarrierRateSearchFr_ddlProduct']"))).getFirstSelectedOption().getText();
		System.err.println("<------NAZ LOG----->"+productSelectedOption);
		
		// This will print the visible text of Product Type
		String productType=driver.findElement(By.xpath("//button[@data-id='PWCMasterPage_PWCWebPartManager_gwpMQCarrierRateSearchFr_MQCarrierRateSearchFr_ddl_ProductType']")).getText();
		System.err.println("<------NAZ LOG----->"+productType);
		
		
		if(!productSelectedOption.equals("Ocean Freight")){
			
			//Selet dropdown based on visible text -->Product
			new Select(driver.findElement(By.xpath("//select[@id='PWCMasterPage_PWCWebPartManager_gwpMQCarrierRateSearchFr_MQCarrierRateSearchFr_ddlProduct']"))).selectByVisibleText("Ocean Freight");
			
		}
		
		if(!productType.equals("FCL (NVOCC)")){
			
				
			//Selet dropdown based on visible text -->Product
			new Select(driver.findElement(By.xpath("//select[@id='PWCMasterPage_PWCWebPartManager_gwpMQCarrierRateSearchFr_MQCarrierRateSearchFr_ddl_ProductType']"))).selectByVisibleText("FCL (NVOCC)");
			
		}

	}

}
