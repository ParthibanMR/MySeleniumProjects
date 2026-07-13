package ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import utils.Constant;
import utils.Log;
import utils.WaitUtils;

public class HomePage extends LoadableComponent<HomePage>{
	public WebDriver driver;
	private boolean isPageLoaded;
	Constant constant;
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		isPageLoaded=true;
	    WaitUtils.waitForSpinner(driver);
		
	}
	
	@FindBy (xpath="//*[@id=\"nav-cart-text-container\"]/span[2]/text()")
	WebElement cartHeader;
	
	@FindBy (id="twotabsearchtextbox")
	WebElement searchBox;
	
	@FindBy (id="nav-search-submit-button")
	WebElement SerchSubmitButton;
	
	@FindBy (css="h2 a")
	List<WebElement> iPhoneLinks;
	
	
	
	public void pageHeaderValidation() {
		String cartText = cartHeader.getText();
		System.out.print("Cart page text "+ cartText);
		
	}
	
	public String searchProduct(String productName) {
		WaitUtils.waitForElementPresent(driver, 5, searchBox, "Search box");
		searchBox.sendKeys(productName);
		String productText = searchBox.getAttribute("value");
		Log.messsage(productText);
		SerchSubmitButton.submit();
		return productText;
	}
	
	public void selectFirstProduct() {
		WaitUtils.waitForAllElementPresent(driver, 5, iPhoneLinks, "I phone links for all product");
	//	for (WebElement webElement : iPhoneLinks) {
		iPhoneLinks.get(0).click();
		Log.messsage("First I phone Link is clicked");
	//	}
	//	System.out.print("Cart page text "+ cartText);
		
	}
	 
	public void switchToWindow() {
		String originalWindow = driver.getWindowHandle();
		 Set<String> windowHandles = driver.getWindowHandles();
		 List<String> windowHandlesList=new ArrayList<>(windowHandles);
		 
		 for (String window : windowHandlesList) {
			if(!window.equals(windowHandlesList)) {
				 driver.switchTo().window(window);
				 Log.messsage("Moved New Window");
			}
		}
		 
	}
	
	public void newWndowtitleValidation(String titleName) {
		Log.messsage("New window title name: "+ titleName);
		Assert.assertEquals(titleName.contains("Apple iPhone 16 Pro Max (256 GB)"), true, "New window Landed");
		
	}
	
	

}
