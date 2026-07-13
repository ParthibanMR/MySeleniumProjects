package ui.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Log;
import utils.WaitUtils;

public class DynamicTablesExamplePage extends LoadableComponent<DynamicTablesExamplePage>{
	private boolean isPageLoaded;	
	public WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public DynamicTablesExamplePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
				if(!isPageLoaded) {
					Assert.fail();
				}
				if(isPageLoaded && !(WaitUtils.waitForElement(driver, NYSEIpoText, WaitUtils.maxElementWait))) {
					Log.messsage("NYSE page did not open up. Site might be down.");
				}else {
					Log.messsage("NYSE home page Login successfully");
				}
		
	}
	
	@Override
	protected void load() {
		isPageLoaded=true;
		
		
	}
	
	@FindBy (xpath ="//span[text()='NYSE IPO Center']")
	WebElement NYSEIpoText;
	
	@FindBy (xpath ="//td[.//strong[text()='MENS']]/preceding-sibling::td[1]")
	WebElement dynamicTdValue;
	
	@FindBy (xpath ="//h3[text()='Cookie Consent']")
	WebElement cookieConsentTabHeader;
	
	@FindBy (css ="button#onetrust-accept-btn-handler")
	WebElement acceptAllCookiesButton;
	
	@FindBy (css = "body > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(3) > table th")
	List<WebElement> tableHeaderListOFData;
	
	@FindBy (css = "table.table-data tbody tr")
	List<WebElement> tableBodyRowListOfData;
	
	
	
	public void getDynamicTDValues() throws Exception {
		try {
			//cookiesTabHandling();
		//	WaitUtils.waitForElement(driver, dynamicTdValue, 1500);
			Thread.sleep(3000);
			String text = dynamicTdValue.getText();
			System.out.println("Dynamic value tesxt: "+text);
			
		}catch (Exception e) {
			throw new Exception("Error while clicking");
		}
		
	}
	
	public void cookiesTabHandling() throws Exception {
		try {
//			WaitUtils.waitForElement(driver, cookieConsentTabHeader, 10000);
			driver.switchTo().alert();
			if(cookieConsentTabHeader != null && cookieConsentTabHeader.isDisplayed()) {
				acceptAllCookiesButton.click();
				Log.messsage("Accepted all cookies.");
			}else {
				Log.messsage("Cookies tab is not avilbel you can move next step");
			}}catch (NoSuchElementException e) {
		        Log.messsage("Cookies tab not present in DOM; skipping.");
				
		}catch (Exception e) {
			throw new Exception("Error while searching the cookies tab");
		}
		
	}
	
	public void acceptCookiesIfPresent() {
	    try {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Wait for the "Accept All Cookies" button to be visible
	        WebElement acceptButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.cssSelector("button#onetrust-accept-btn-handler")));

	        // Click the accept button
	        acceptButton.click();
	        System.out.println("✅ 'Accept All Cookies' button clicked");

	    } catch (Exception e) {
	        System.out.println("ℹ️ Cookies popup not present or already dismissed");
	    }
	}
	
	public void printTableDatas() throws Exception {
		List<String> headerTitles = new ArrayList<>();
		try {
			WaitUtils.waitForAllElementPresent(driver, 0, tableHeaderListOFData, "Table heasders");
			for (WebElement elementsForHeader : tableHeaderListOFData) {
				String headerTitleText = elementsForHeader.getText();
				headerTitles.add(headerTitleText.trim());
			}
			System.out.println(String.join(" | ", headerTitles));
			
			//get rows
			for (WebElement rowdatas : tableBodyRowListOfData) {
				List<WebElement> columncells = rowdatas.findElements(By.cssSelector("td"));
				List<String> rowData = new ArrayList<>();
				
				for (WebElement td : columncells) {
			        rowData.add(td.getText().trim());
			    }

			    // 4. Print the row data
			    System.out.println(String.join(" | ", rowData));
				
			}
			
			
		}catch (Exception e) {
			throw new Exception("Error while getting the table values");
		}
		
	}
	
	public void printTableDatasWithMap() throws Exception {
		List<String> headerTitles = new ArrayList<>();
		try {
			WaitUtils.waitForAllElementPresent(driver, 0, tableHeaderListOFData, "Table heasders");
			for (WebElement elementsForHeader : tableHeaderListOFData) {
				String headerTitleText = elementsForHeader.getText();
				headerTitles.add(headerTitleText.trim());
			}
			System.out.println(String.join(" | ", headerTitles));
			
			//get rows 
			List<Map<String, String>> tableData = new ArrayList<>();
			
			for (WebElement rowdatas : tableBodyRowListOfData) {
				List<WebElement> columncells = rowdatas.findElements(By.cssSelector("td"));
				
				Map<String, String> rowMap = new LinkedHashMap<>();
				
				for (int i = 0; i < columncells.size(); i++) {
					String Key = headerTitles.get(i);
					String values = columncells.get(i).getText().trim();
					rowMap.put(Key, values);
				}

				tableData.add(rowMap);
				
			}
			for (Map<String, String> map : tableData) {
				System.out.println(map);
			}
			
			
		}catch (Exception e) {
			throw new Exception("Error while getting the table values");
		}
		
	}
	
	
//	public void listOfTabsAndMobileTabClick() throws Exception {
//		String HomepageTabTexts = null;
//		try {
//			WaitUtils.waitForAllElementPresent(driver, 0, homePageTabs, "Homepage Tabs");
//			for (WebElement webElement : homePageTabs) {
//				HomepageTabTexts = webElement.getText();
//				System.out.println(HomepageTabTexts);
//				
//				if(HomepageTabTexts.equals("Mobiles")) {
//					 try {
//				            webElement.click();
//						  //  js.executeScript("argumemts[0].click();", webElement);
//				            System.out.println("Clicked on Mobiles tab.");
//				        } catch (Exception e) {
//				            System.out.println("Failed to click on Mobiles tab: " + e.getMessage());
//				            throw e;
//				        }
//				        break; // stop loop once found
//				    }}}catch (Exception e) {
//						// TODO: handle exception
//					}
//			
//		}
//	
//	public void Search() throws Exception {
//		try {
//		//	WaitUtils.waitForElement(driver, SeacrhBarForMobile, 1000);
//			WaitUtils.waitForElementPresent(driver, 1000, SeacrhBarForMobile, "Wait for searchbar");
//			SeacrhBarForMobile.sendKeys("apple mobile" + Keys.ENTER);
//				
//				
//			}catch (Exception e) {
//				throw new Exception("Unable to search");
//			}
//	   
//	}
//	
//	public void IPhoneMobileList() throws Exception {
//		try {
//			WaitUtils.waitForAllElementPresent(driver, 500, IPhoneList, "Homepage Tabs");
//			for (WebElement webElement : IPhoneList) {
//				webElement.click();
//			}
//			
//		
//		}catch (Exception e) {
//			// TODO: handle exception
//			throw new Exception("The LIst of I phone not available");
//		}
//	}
//	
//	public void windowsHandlingByTitile() throws Exception {
//		try {
//			String windowHandle = driver.getWindowHandle();
//			Set<String> windowHandles = driver.getWindowHandles();
//			
//			for (String windows : windowHandles) {
//				driver.switchTo().window(windows);
//				String titles = driver.getTitle();
//				System.out.println("Print titiles: "+titles);
//				
//				if(titles.equalsIgnoreCase("APPLE iPhone 15 (Green, 128 GB)")) {
//					System.out.println("✅ Switched to window: " + titles);
//					return;
//					
//				}
//				
//				
//			}
//			
//			
//		
//		}catch (Exception e) {
//			// TODO: handle exception
//			throw new Exception("The titile of that particular window not available");
//		}
//	}
	
}
		
