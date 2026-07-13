package com.examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsExplanation {
	public WebDriver driver;
	
	/*It is the very first method that runs before any test starts in the entire project/suite.
     It runs only once.
     Usually used for global setup (things that all tests need)
     
     Before running those 100 tests, you might need to, Connect to a database (e.g., fetch test data),
     Start a reporting tool (like ExtentReports), Initialize a server/API.*/
	
	@BeforeSuite
	public void setupSuite() {
	    System.out.println("Connecting to Database before test suite...");

	}
	
	/*Runs only once before all test methods in that <test> section of your testng.xml.
    Example:
    browser initilization
    This setup is common for all test cases.*/
	
	@BeforeTest
	public void launchBrowser() {
		 WebDriverManager.chromedriver().setup();
         ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(options);
         System.out.println("Chrome driver launched");
	}
	
	// Runs once per class (before the first @Test method in that class) → open Flipkart URL
	
	@BeforeClass
	public void navigateToApp() {
	    driver.get("https://www.flipkart.com/");
	    System.out.println("Navigated to Flipkart...");
	}
	/*Runs before every single @Test method.
    Example:
    Do Login before each test case
    Because you want each test to start with a fresh login session.*/
	
	@BeforeMethod
	public void login() {
	    System.out.println("Logging into Flipkart...");
	    // enter username/password, click login
	}
	
	@Test(groups = "search")
	public void searchProduct() {
	    System.out.println("Searching for iPhone...");
	}

	@Test(groups = "cart")
	public void addToCart() {
	    System.out.println("Adding product to cart...");
	}

	/*Runs After every single @Test method.
    Example:
    Logout.*/
	@AfterMethod
	public void logout() {
	    System.out.println("Logging out from Flipkart...");
	}
	
	// Runs once per class (before the first @Test method in that class) → open Flipkart URL
	@AfterClass
	public void closeBrowser() {
		 driver.quit();
		  System.out.println("Browser closed...");
	}
	
	/*Runs only once after all test methods in that <test> section of your testng.xml.
    This setup is common for all test cases.*/
	
	@AfterTest
	public void tearDownTest() {
	    System.out.println("Clearing cookies after all tests in class...");
	}
	
	//lose the DB connection, report global levelc
	@AfterSuite
	public void tearDownSuite() {
	    System.out.println("Disconnecting DB after suite...");
	}
}
