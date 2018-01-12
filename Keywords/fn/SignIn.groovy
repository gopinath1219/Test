package fn

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import com.kms.katalon.core.webui.driver.DriverFactory

/**
 *
 *
 * @author Nazeer Mohammed
 * NaMohammed@agility.com
 *
 *
 */


public class SignIn {
	
	public static final String testApp = GlobalVariable.testApp;
	public static String URL = "";
	
	
	@Keyword
	public static void As(String User, String password) throws Throwable
	{
		

		if (testApp.replace(" ", "").toLowerCase().equals("sit"))
		{
			URL = "http://"+GlobalVariable.SIT+"/login.aspx";
			System.err.println("-----NAZ LOG: ----- "+URL);
			WebUI.openBrowser(URL)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(30)
			WebUI.setText(findTestObject('SIT_Login_Page/UserName'), User)
			WebUI.setText(findTestObject('SIT_Login_Page/Password'), 'q')
			WebUI.click(findTestObject('SIT_Login_Page/signIn_BTN'))
			WebUI.waitForPageLoad(300)
			WebUI.waitForJQueryLoad(300)
			
			
		}

		// -------------------------------- DEMO SITE-------------------------------------------//
		else if (testApp.replace(" ", "").toLowerCase().equals("demo"))
		{
			URL = "https://" + User + ":" + password + "@"+GlobalVariable.DEMO+"/";
			System.err.println("-----NAZ LOG: ----- "+URL);
			WebUI.openBrowser(URL)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(300)
			WebUI.waitForJQueryLoad(300)
			
			
		}
		
		
		// -------------------------------- DEMO  173-------------------------------------------//

		else if (testApp.replace(" ", "").toLowerCase().equals("demo173"))
		{
			URL = "http://" + User + ":" + password + "@"+GlobalVariable.DEMO173+"/";
			System.err.println("-----NAZ LOG: ----- "+URL);
			WebUI.openBrowser(URL)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(300)
			WebUI.waitForJQueryLoad(300)
			
			
		}
		
		// -------------------------------- DEMO  174-------------------------------------------//
		else if (testApp.replace(" ", "").toLowerCase().equals("demo174"))
		{
			URL = "http://" + User + ":" + password + "@"+GlobalVariable.DEMO174+"/";
			System.err.println("-----NAZ LOG: ----- "+URL);
			WebUI.openBrowser(URL)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(300)
			WebUI.waitForJQueryLoad(300)
			
		
		}
		
		// -------------------------------- LIVE  45-------------------------------------------//
		else if (testApp.replace(" ", "").toLowerCase().equals("live45"))
		{
			URL = "http://" + User + ":" + password + "@"+GlobalVariable.LIVE45+"/";
			System.err.println("-----NAZ LOG: ----- "+URL);
			WebUI.openBrowser(URL)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(300)
			WebUI.waitForJQueryLoad(300)
			
			
		}
		
		// -------------------------------- LIVE  46-------------------------------------------//
		else if (testApp.replace(" ", "").toLowerCase().equals("live46"))
		{
			URL = "http://" + User + ":" + password + "@"+GlobalVariable.LIVE46+"/";
			System.err.println("-----NAZ LOG: ----- "+URL);
			WebUI.openBrowser(URL)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(300)
			WebUI.waitForJQueryLoad(300)
			
			
		}

		// -------------------------------- LIVE SITE-------------------------------------------//
		else if (testApp.replace(" ", "").toLowerCase().equals("live"))
		{
			URL = "https://" + User + ":" + password + "@"+GlobalVariable.LIVE+"/";
			System.err.println("-----NAZ LOG: ----- "+URL);
			WebUI.openBrowser(URL)
			WebUI.maximizeWindow()
			WebUI.waitForPageLoad(300)
			WebUI.waitForJQueryLoad(300)
			
			/*WebUI.waitForElementPresent(findTestObject('MQ/ListPage/btn_Create Multi-Quote'), 300)
			WebUI.waitForElementClickable(findTestObject('MQ/ListPage/btn_Create Multi-Quote'), 300)*/
		}
		
		
		else {
			
			System.err.println("NAZ LOG: TEST APP DECLARED IN INCORRECT");
		}

	}

}


