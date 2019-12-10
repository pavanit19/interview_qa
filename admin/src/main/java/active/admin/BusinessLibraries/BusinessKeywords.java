package active.admin.BusinessLibraries;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusinessKeywords {
	
	public static WebDriver dr;
	public static WebElement element;
	public static WebElement waitElement;
	public static WebDriverWait wait;
	
	//open a browser
	public static void openBrowser (String browser) {
		try {
			if (browser.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir") + "\\Config_Drivers\\chromedriver.exe"));
				dr = new ChromeDriver();	
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver", (System.getProperty("user.dir") + "\\Config_Drivers\\IEDriverServer.exe"));
				dr = new InternetExplorerDriver();
			} else if (browser.equalsIgnoreCase("FF")) {
				System.setProperty("webdriver.gecko.driver",(System.getProperty("user.dir") + "\\Config_Drivers\\geckodriver.exe"));
				dr =new FirefoxDriver();
			} else {
				System.out.println("Invalid browser selection");
			}
			System.out.println("User is able to open " + browser + " browser");
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("User is not able to open " + browser + " browser");
		}
	}
	
	//launch the application
	public static void launchApp (String url) {
		try {
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);			
			dr.get(url);
			System.out.println("User is able to launch the application");
		} catch (Exception a) {
			a.printStackTrace();
			System.out.println("User is not able to launch the application");
		}
	}
	
	//verify elements present on the page
	public static void veriElementsPresent (String xpathValue, String value) {
		try {
			String[] panels = value.split(",");
			
			List<WebElement> elements = dr.findElements(By.xpath(xpathValue));
			
			for (WebElement we : elements) {			
				String elemtValue = we.getText();
				System.out.println("Dashboard panel - " + elemtValue);
				
				int i = 0;
				while (i < panels.length) {
					if (elemtValue.equalsIgnoreCase(panels[i])) {
						System.out.println(elemtValue + " panel is visible on the page");
					}
					i ++;
				}
			}			
		}catch (Exception a) {
			a.printStackTrace();
			System.out.println("Element is not visible on the page");
		}
	}
	
	//verify single element present on the page
	public static void verifyElementPresent (String xpathValue, String value) {
		try {	
			wait = new WebDriverWait(dr,30);
			waitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
			
			List<WebElement> elements = dr.findElements(By.xpath(xpathValue));							
				
			for (WebElement we : elements) {
				String elemtValue = we.getText();					
				if (elemtValue.equalsIgnoreCase(value)) {
					System.out.println(elemtValue + " product created on Products page");
				}	
			}
		}catch (Exception a) {
			a.printStackTrace();
			System.out.println(value + " product is not created on Products page");
		}
	}
		
	//close browser
	public static void closeBrowser () {
		try {
			dr.close();
			dr.quit();
			System.out.println("User is able to close the browser");
		}catch (Exception a) {
			a.printStackTrace();
			System.out.println("User is not able to close the browser");
		}
	}
	
	//enter a text value
	public static void enterText (String xpathValue, String enetrValue) {
		try {
			dr.findElement(By.xpath(xpathValue)).sendKeys(enetrValue);
			System.out.println("User is able to enter " + enetrValue + " value");
		}catch (Exception a) {
			a.printStackTrace();
			System.out.println("User is not able to enter " + enetrValue + " value");
		}
	}
	
	//click a button
	public static void clickButton (String xpathValue) {
		try {
			wait = new WebDriverWait(dr,30);
			waitElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue)));
			dr.findElement(By.xpath(xpathValue)).click();
			System.out.println("User is able to click the button");
		}catch (Exception a) {
			a.printStackTrace();
			System.out.println("User is not able to click the button");
		}
	}
	
	//select a drop down list
	public static void selectItem (String xpathValue, String seelctItem) {
		try {
			WebElement el = dr.findElement(By.xpath(xpathValue));
			Select sele = new Select (el);
			sele.selectByVisibleText(seelctItem);
			System.out.println("User is able to select " + seelctItem);
		}catch (Exception a) {
			a.printStackTrace();
			System.out.println("User is not able to select " + seelctItem);
		}
	}
	

}
