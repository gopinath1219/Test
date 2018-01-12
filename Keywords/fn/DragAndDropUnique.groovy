package fn

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject


public class DragAndDropUnique {
	
	public static WebDriver driver;
	
	public static String xpathROW;
	
	@Keyword
	public void portCodesFCL () {		
		//WebUI.waitForPageLoad(300)		
		//WebUI.waitForJQueryLoad(300)	
		
		driver = DriverFactory.getWebDriver()
		
		WebUI.waitForElementClickable(findTestObject('MQ/CarrierSearch/chkAllRoutes'), 600)
		
		
		List<WebElement> MOP = driver.findElements(By.xpath("//*[@id='draggable']/tbody/tr/td[7]"));
		List<WebElement> MDP = driver.findElements(By.xpath("//*[@id='draggable']/tbody/tr/td[10]"));		
		
		String[] port = new String[MOP.size()];		
		System.out.println("MOP Size: "+MOP.size());
		
		for (int i = 0; i < MOP.size(); i++)
		{
			port[i] = MOP.get(i).getText()+MDP.get(i).getText();			
			
		}
		
		for(int i=0;i<port.length;i++){
			boolean isDistinct = false;
			for(int j=0;j<i;j++){
				if(port[i].equals(port[j])){
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct){
				System.out.println(i);
				int rowNo=i+1;					
				xpathROW=String.valueOf(rowNo);
				
				//if(rowNo>9){
//				
				//}
				
				
				WebElement LocatorFrom = driver.findElement(By.xpath("//*[@id='draggable']/tbody/tr["+xpathROW+"]/td[7]")); // draggable
				WebElement DP  = driver.findElement(By.xpath("//*[@id='draggable']/tbody/tr["+xpathROW+"]/td[10]")); //DP: Destination Port
				highlight(LocatorFrom)
				highlight(DP)
				
				WebElement LocatorTo = driver.findElement(By.xpath("//*[@id='cart']")); // droppable
				
				String xto=Integer.toString(LocatorTo.getLocation().x);
				String yto=Integer.toString(LocatorTo.getLocation().y);
				
				((JavascriptExecutor)driver).executeScript('function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\'HTMLEvents\'?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\'on\'+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; ' +
					'simulate(arguments[0],\'mousedown\',0,0); simulate(arguments[0],\'mousemove\',arguments[1],arguments[2]); simulate(arguments[0],\'mouseup\',arguments[1],arguments[2]); ', LocatorFrom,xto,yto);
			}
			
			
		}		
	
		Thread.sleep(500)
		//scrollToCheckBox(xpathROW);
	}
	
	
	
	@Keyword
	public void portCodesAir () {
		//WebUI.waitForPageLoad(300)
		//WebUI.waitForJQueryLoad(300)
		
		driver = DriverFactory.getWebDriver()
		
		WebUI.waitForElementClickable(findTestObject('MQ/CarrierSearch/chkAllRoutes'), 600)
		
		
		List<WebElement> MOP = driver.findElements(By.xpath("//*[@id='draggable']/tbody/tr/td[7]"));
		//List<WebElement> MDP = driver.findElements(By.xpath("//*[@id='draggable']/tbody/tr/td[10]")); // For  Ocean FCL td[10]
		List<WebElement> MDP = driver.findElements(By.xpath("//*[@id='draggable']/tbody/tr/td[9]"));  // For Air td[9]
		
		String[] port = new String[MOP.size()];
		System.out.println("MOP Size: "+MOP.size());
		
		for (int i = 0; i < MOP.size(); i++)
		{
			port[i] = MOP.get(i).getText()+MDP.get(i).getText();
			
		}
		
		for(int i=0;i<port.length;i++){
			boolean isDistinct = false;
			for(int j=0;j<i;j++){
				if(port[i].equals(port[j])){
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct){
				System.out.println(i);
				int rowNo=i+1;
				xpathROW=String.valueOf(rowNo);
				
				//if(rowNo>9){
//
				//}
				
				
				WebElement LocatorFrom = driver.findElement(By.xpath("//*[@id='draggable']/tbody/tr["+xpathROW+"]/td[7]")); // draggable
				//WebElement DP  = driver.findElement(By.xpath("//*[@id='draggable']/tbody/tr["+xpathROW+"]/td[10]")); //DP: Destination Port - td[10] Ocean FCL
				WebElement DP  = driver.findElement(By.xpath("//*[@id='draggable']/tbody/tr["+xpathROW+"]/td[9]")); //DP: Destination Port  - td[9] AIR
				highlight(LocatorFrom)
				highlight(DP)
				
				WebElement LocatorTo = driver.findElement(By.xpath("//*[@id='cart']")); // droppable
				
				String xto=Integer.toString(LocatorTo.getLocation().x);
				String yto=Integer.toString(LocatorTo.getLocation().y);
				
				((JavascriptExecutor)driver).executeScript('function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\'HTMLEvents\'?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\'on\'+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; ' +
					'simulate(arguments[0],\'mousedown\',0,0); simulate(arguments[0],\'mousemove\',arguments[1],arguments[2]); simulate(arguments[0],\'mouseup\',arguments[1],arguments[2]); ', LocatorFrom,xto,yto);
			}
			
			
		}
	
		Thread.sleep(500)
		//scrollToCheckBox(xpathROW);
	}
	
	
	
	@Keyword
	public void portCodesLCL () {
		//WebUI.waitForPageLoad(300)
		//WebUI.waitForJQueryLoad(300)
		
		driver = DriverFactory.getWebDriver()
		
		WebUI.waitForElementClickable(findTestObject('MQ/CarrierSearch/chkAllRoutes'), 600)
		
		
		List<WebElement> MOP = driver.findElements(By.xpath("//*[@id='draggable']/tbody/tr/td[6]")); // LCL MOP
		
		List<WebElement> MDP = driver.findElements(By.xpath("//*[@id='draggable']/tbody/tr/td[9]"));  // LCL MDP
		
		String[] port = new String[MOP.size()];
		System.out.println("MOP Size: "+MOP.size());
		
		for (int i = 0; i < MOP.size(); i++)
		{
			port[i] = MOP.get(i).getText()+MDP.get(i).getText();
			
		}
		
		for(int i=0;i<port.length;i++){
			boolean isDistinct = false;
			for(int j=0;j<i;j++){
				if(port[i].equals(port[j])){
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct){
				System.out.println(i);
				int rowNo=i+1;
				xpathROW=String.valueOf(rowNo);
				
				//if(rowNo>9){
//
				//}
				
				
				WebElement LocatorFrom = driver.findElement(By.xpath("//*[@id='draggable']/tbody/tr["+xpathROW+"]/td[6]")); // draggable LCL MOP
				WebElement DP  = driver.findElement(By.xpath("//*[@id='draggable']/tbody/tr["+xpathROW+"]/td[9]")); //DP: LCL MDP
				highlight(LocatorFrom)
				highlight(DP)
				
				WebElement LocatorTo = driver.findElement(By.xpath("//*[@id='cart']")); // droppable
				
				String xto=Integer.toString(LocatorTo.getLocation().x);
				String yto=Integer.toString(LocatorTo.getLocation().y);
				
				((JavascriptExecutor)driver).executeScript('function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\'HTMLEvents\'?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\'on\'+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; ' +
					'simulate(arguments[0],\'mousedown\',0,0); simulate(arguments[0],\'mousemove\',arguments[1],arguments[2]); simulate(arguments[0],\'mouseup\',arguments[1],arguments[2]); ', LocatorFrom,xto,yto);
			}
			
			
		}
	
		Thread.sleep(500)
		//scrollToCheckBox(xpathROW);
	}
	
	
	
	
	private String rowCheckBox(String xpath){
		return "//*[@id='draggable']/tbody/tr[" + xpath + "]/td[1]"
	}
	
	// xpath will get generated during the run time
	// I need to create test object during run time
	// For creating test object one can use TestObject class
	
	private TestObject getMenuTestObject(String menuName){
		TestObject row = new TestObject(menuName);
		row.addProperty("xpath", ConditionType.EQUALS, rowCheckBox(menuName), true);
		System.out.println("Xpath : " + rowCheckBox(menuName))
		return row
	}
	
	
	
	public void scrollToCheckBox(String rowNo){
		TestObject checkBoxScroll = getMenuTestObject(rowNo)
		WebUI.scrollToElement(checkBoxScroll,5)		
	}
	
	
	
	
	
	
	
	public void highlight(WebElement element){
		
		
		for (int i = 0; i < 1; i++) {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style','background: Crimson; border: 3px solid Gold;');",
					element);
		}
		
	}	
	
	
	
	
}
