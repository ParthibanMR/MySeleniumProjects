package com.examples;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import ui.pages.DynamicTablesExamplePage;
import ui.pages.FlipkartHomepage;
import utils.Log;

public class TestNgTopicsExamples {

	public String browserName="CHRome";
	WebDriver driver=null;
	
	@BeforeTest
	public void browsers() {
		if(browserName.equalsIgnoreCase("chrome")) {
			  WebDriverManager.chromedriver().setup();
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--remote-allow-origins=*");
	            driver = new ChromeDriver(options);
	            System.out.println("Chrome driver launched");
		}else {
			WebDriverManager.edgedriver().setup();
			Log.messsage("edge driver was launched");
		}
	}
	
	@BeforeMethod
	public void launch() {
		//If we use only one url that this works, I am using different URLS
//		driver.get("https://www.flipkart.com/");
//		driver.manage().window().maximize();
		Log.messsage("Launch the website: ");
	}
	
	@Test
	public void Test1() throws Exception {
		//Flipkart for windows handling
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		FlipkartHomepage fhp=new FlipkartHomepage(driver);
		fhp.click();
		fhp.listOfTabsAndMobileTabClick();
		fhp.Search();
		fhp.IPhoneMobileList();
		fhp.windowsHandlingByTitile();	
	}
	
	@Test
	public void TestChromeLaunch() throws Exception {
		System.out.println("Whether Chrome is launched or not");
	}
	
	@Test
	public void Test2() throws Exception {
		driver.get("https://www.nyse.com/ipo-center/recent-ipo");
		driver.manage().window().maximize();
		DynamicTablesExamplePage dte= new DynamicTablesExamplePage(driver);
//		dte.cookiesTabHandling();
		dte.acceptCookiesIfPresent();
		dte.getDynamicTDValues();
	//	dte.printTableDatas();
		dte.printTableDatasWithMap();
			
	}
	@Test
	public void Test3() throws Exception {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		FlipkartHomepage fhp=new FlipkartHomepage(driver);
		fhp.moveToElementMethod();		
	}
	@Test
	public void Test4() throws Exception {
		//  WebDriverManager.chromedriver().setup();
		 WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
         options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver();
		  
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
		
	}

}
