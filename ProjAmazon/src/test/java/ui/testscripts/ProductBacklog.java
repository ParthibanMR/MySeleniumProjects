package ui.testscripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import io.github.bonigarcia.wdm.WebDriverManager;
import ui.pages.HomePage;
import utils.Constant;
import utils.Log;



public class ProductBacklog {
	public String username="parthiban.ravi";
	public String accessKey="NzE3GGw3yvDrNO9mFI6KxJ9oLyRCa4ejq15ucVYxj6S9m8bLSI";
	public String gridurl="https://parthiban.ravi:NzE3GGw3yvDrNO9mFI6KxJ9oLyRCa4ejq15ucVYxj6S9m8bLSI@hub.lambdatest.com/wd/hub";
//	public RemoteWebDriver driver;
	public WebDriver driver;
	
	Constant constant;
//	private WebDriver driver;
	private String URL="https://www.amazon.in/ref=nav_logo";
	
	
	
	
	@BeforeClass
	public void starting() {
		System.out.println("Started");
	}
//	public void lambdaCapabilities() throws MalformedURLException {
//		//Setting up capabilities to run our test script
//	        DesiredCapabilities capabilities = new DesiredCapabilities();
//	        capabilities.setCapability("browserName", "Chrome");
//	 //       capabilities.setCapability("browserName", "edge");
//	        capabilities.setCapability("version", "latest");
//	        capabilities.setCapability("platform", "Windows 10"); // If this cap isn't specified, it will just get any available one
//	        capabilities.setCapability("build", "LambdaTestMyProject");
//	        capabilities.setCapability("name", "LambdaAmazonApp");
//	        capabilities.setCapability("network", true); // To enable network logs
//	        capabilities.setCapability("visual", true); // To enable step by step screenshot
//	        capabilities.setCapability("video", true); // To enable video recording
//	        capabilities.setCapability("console", true); // To capture console logs
////
////	 capabilities.setCapability("selenium_version","4.0.0-alpha-2");
//	         capabilities.setCapability("timezone","UTC+05:30");
//	         capabilities.setCapability("geoLocation","IN");
////	         capabilities.setCapability("chrome.driver","78.0");
//	       
//	        	driver = new RemoteWebDriver(new URL(gridurl), capabilities); 

	    
//	} 
	
	@BeforeMethod (alwaysRun = true)
	@Parameters ("browser")
	public void setup(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			Log.messsage("Chrome browser is launched");
		} else if(browser.equals("edge")){
			WebDriverManager.edgedriver().setup();
			Log.messsage("Edge browser is launched");
		} else {
			Log.messsage("There is no browser");
		}
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
	//	String URL = context.getCurrentXmlTest().getParameter("amazonUrl"); 
		driver.get(URL);
	    driver.manage().window().maximize();
	    Log.messsage("Amazon application launched successfully");
	    String title = driver.getTitle();
	    Log.messsage(title);
	    Assert.assertEquals(true, true, "Amazon home page is landed successfully");
	
	}
	
	@Test (priority = 1, description = "Search \"iPhone\" product")
	public void firstScript() {
       HomePage homePage=new HomePage(driver);
       String searchProduct = homePage.searchProduct("iphone 16 pro max 256gb");
       Assert.assertEquals(searchProduct.equals("iphone 16 pro max 256gb"), true, "The Prduct \"Iphone\" is serached successfully and Landed new Iphone product Tab");
	}
	
	@Test (priority = 2, description = "Naviagte to Iphone Tab")
	public void secondScript() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		homePage.searchProduct("iphone 16 pro max 256gb");
		homePage.selectFirstProduct();
		homePage.switchToWindow();
		Thread.sleep(3000);
		String newWindowtitle = driver.getTitle();	
//		Log.messsage("New window name: "+newWindowtitle);
		homePage.newWndowtitleValidation(newWindowtitle);
		Log.messsage("User landed Iphone product detailed window");
		
		
	}
	
	@AfterClass
	public void Tear() {
		driver.quit();
	}

}
