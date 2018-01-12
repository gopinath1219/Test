import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

//1
CustomKeywords.'new1.SignInIE.As'(GlobalVariable.CSR_User, GlobalVariable.CSR_password)

//CustomKeywords.'fn.SignIn.As'(GlobalVariable.CSR_User, GlobalVariable.CSR_password)
//2
CustomKeywords.'fn.Create.mutiQuote'()

//3
'Air Freight'
WebUI.selectOptionByLabel(findTestObject('MQ/CarrierSearch/Product'), 'Air Freight', false)

//4
'Expedited   Premier  Value'
WebUI.selectOptionByLabel(findTestObject('MQ/CarrierSearch/ProductType'), 'Expedited', false)

WebUI.selectOptionByLabel(findTestObject('MQ/CarrierSearch/ProductType'), 'Premier', false)

WebUI.selectOptionByLabel(findTestObject('MQ/CarrierSearch/ProductType'), 'Value', false)

//5
CustomKeywords.'fn.Search.multiple'('OriginPort', 'UAK,NAQ,KUS,')

CustomKeywords.'fn.Search.multiple'('DestinationPort', 'KWI')

WebUI.selectOptionByLabel(findTestObject('MQ/CarrierSearch/Agility Movement Type'), 'Airport to Airport', false)

WebUI.selectOptionByLabel(findTestObject('MQ/CarrierSearch/OF Term'), 'Prepaid', false)

WebUI.click(findTestObject('MQ/CarrierSearch/HAZ NO'))

WebUI.click(findTestObject('MQ/CarrierSearch/KnownShipper YES'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('MQ/CarrierSearch/Search_Carrier_Contract'))

CustomKeywords.'fn.DragAndDropUnique.portCodesAir'()

CustomKeywords.'fn.Create.MQ_with_AgilityTariff'()

GlobalVariable.MQ_No = WebUI.getText(findTestObject('Object Repository/MQ/QuoteInfoPage/getQuoteNo'))

System.err.println(GlobalVariable.MQ_No)

WebUI.setText(findTestObject('MQ/QuoteInfoPage/Add Cargo Desription'), CustomKeywords.'fn.Host.details'())

WebUI.setText(findTestObject('MQ/QuoteInfoPage/QuoteCustomerRefNo'), CustomKeywords.'fn.Host.name'())

WebUI.takeScreenshot()

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('MQ/QuoteInfoPage/btn_Save_and_Continue'), 30)

WebUI.click(findTestObject('MQ/QuoteInfoPage/btn_Save_and_Continue'))

WebUI.waitForPageLoad(300)

WebUI.waitForJQueryLoad(300)

WebUI.click(findTestObject('MQ/MQ_Tab/QuoteSummaryTab'))

CustomKeywords.'fn.Select.Customer'()

CustomKeywords.'fn.Submit_To.QuoteApprover'()

WebUI.closeBrowser()

CustomKeywords.'new1.SignInIE.As'(GlobalVariable.QT_Approver, GlobalVariable.CSR_password)

CustomKeywords.'fn.DragAndDropUnique_OLD.portCodesFCL'()

