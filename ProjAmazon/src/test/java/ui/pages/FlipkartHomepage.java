package ui.pages;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import utils.Log;
import utils.WaitUtils;

public class FlipkartHomepage extends LoadableComponent<FlipkartHomepage>{
	private boolean isPageLoaded;	
	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public FlipkartHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				if(!isPageLoaded) {
					Assert.fail();
				}
				if(isPageLoaded && !(WaitUtils.waitForElement(driver, loginText, WaitUtils.maxElementWait))) {
					Log.messsage("EmployeePortal home page did not open up. Site might be down.");
				}else {
					Log.messsage("EmployeePortal home page Login successfully");
				}
		
	}
	
	@Override
	protected void load() {
		isPageLoaded=true;
		
		
	}
	
	@FindBy (xpath ="(//span[text()='Login'])[1]")
	WebElement loginText;
	
	@FindBy (css ="div span._30XB9F")
	WebElement closeWindowCrossBar;
	
	@FindBy (xpath = "//span[text()='Mobiles']")
	WebElement MobilesTab;
	
	@FindBy (css = "div.YBLJE4")
	List<WebElement> homePageTabs;
	
	@FindBy (css ="input.zDPmFV")
	WebElement SeacrhBarForMobile;
	
	@FindBy (css = "div.KzDlHZ")
	List<WebElement> IPhoneList;
	
	@FindBy (xpath = "//div[@aria-label='Beauty, Toys & More']")
	WebElement toysButtonMoveToElement;
	
	@FindBy (xpath = "//a[starts-with(@href, '/food-products')]")
	WebElement foodProductsMoveToElement;
	
	
	
	
	
	
	public void click() throws Exception {
		try {
			if (closeWindowCrossBar != null && closeWindowCrossBar.isDisplayed()) {
	            closeWindowCrossBar.click();
	            Log.messsage("Closed the login tab.");
	        } else {
	            Log.messsage("Login Tab is not present.");
	        }}catch (NoSuchElementException | ElementNotInteractableException e) {
	            Log.messsage("Login Tab is not present or not clickable.");
		}catch (Exception e) {
			throw new Exception("Error while clicking");
		}
		
	
	}
	
	public void listOfTabsAndMobileTabClick() throws Exception {
		String HomepageTabTexts = null;
		try {
			WaitUtils.waitForAllElementPresent(driver, 0, homePageTabs, "Homepage Tabs");
			for (WebElement webElement : homePageTabs) {
				HomepageTabTexts = webElement.getText();
				System.out.println(HomepageTabTexts);
				
				if(HomepageTabTexts.equals("Mobiles")) {
					 try {
				            webElement.click();
						  //  js.executeScript("argumemts[0].click();", webElement);
				            System.out.println("Clicked on Mobiles tab.");
				        } catch (Exception e) {
				            System.out.println("Failed to click on Mobiles tab: " + e.getMessage());
				            throw e;
				        }
				        break; // stop loop once found
				    }}}catch (Exception e) {
						// TODO: handle exception
					}
			
		}
	
	public void Search() throws Exception {
		try {
		//	WaitUtils.waitForElement(driver, SeacrhBarForMobile, 1000);
			WaitUtils.waitForElementPresent(driver, 1000, SeacrhBarForMobile, "Wait for searchbar");
			SeacrhBarForMobile.sendKeys("apple mobile" + Keys.ENTER);
				
				
			}catch (Exception e) {
				throw new Exception("Unable to search");
			}
	   
	}
	
	public void IPhoneMobileList() throws Exception {
		try {
			WaitUtils.waitForAllElementPresent(driver, 500, IPhoneList, "Homepage Tabs");
			for (WebElement webElement : IPhoneList) {
				webElement.click();
			}
			
		
		}catch (Exception e) {
			// TODO: handle exception
			throw new Exception("The LIst of I phone not available");
		}
	}
	
	public void windowsHandlingByTitile() throws Exception {
		try {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			
			for (String windows : windowHandles) {
				driver.switchTo().window(windows);
				String titles = driver.getTitle();
				System.out.println("Print titiles: "+titles);
				
				if(titles.equalsIgnoreCase("APPLE iPhone 15 (Green, 128 GB)")) {
					System.out.println("✅ Switched to window: " + titles);
					return;
					
				}
				
				
			}
			
			
		
		}catch (Exception e) {
			// TODO: handle exception
			throw new Exception("The titile of that particular window not available");
		}
	}
	
	
	public void moveToElementMethod() throws Exception {
		try {
			Actions actions = new Actions(driver);
		//	WaitUtils.waitForElement(driver, toysButtonMoveToElement, 500);
			actions.moveToElement(toysButtonMoveToElement).perform();
			actions.moveToElement(foodProductsMoveToElement).click().perform();
			
		
		}catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Unable to reach move to element");
		
		}	
	}
}
		
