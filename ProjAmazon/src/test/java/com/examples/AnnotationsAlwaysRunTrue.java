package com.examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnotationsAlwaysRunTrue {
	    WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	    	WebDriverManager.chromedriver().setup();
	    	ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            options.addArguments("--disable-notifications");
            options.addArguments("--start-maximized=*");
            
	        driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com/");
	        System.out.println("✅ Browser launched & Flipkart opened");
	    }

	    @BeforeMethod
	    public void login() {
	        System.out.println("✅ Login step executed");
	        // Assume login done here
	    }

	    @Test
	    public void searchProduct() {
	        System.out.println("🔍 Searching product...");
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("iPhone 15");

	        // intentionally fail to test alwaysRun
	        Assert.fail("❌ Search failed due to element not clickable");
	    }
	    
	    @Test
	    public void searchProductTest2() {
	        System.out.println("🔍 Searching product...");
	        WebElement searchBox = driver.findElement(By.name("q"));
	        searchBox.sendKeys("iPhone 16");
	    }

	    @AfterMethod(alwaysRun = true)
	    public void logout() {
	        System.out.println("🚪 Logout executed (always runs, even if test fails)");
	        // Assume logout action here
	    }

	    @AfterTest(alwaysRun = true)
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	            System.out.println("🛑 Browser closed (always runs)");
	        }
	    }
	    
	    /*✅ Browser launched & Flipkart opened
✅ Login step executed
🔍 Searching product...
❌ Search failed due to element not clickable
🚪 Logout executed (always runs, even if test fails)
🛑 Browser closed (always runs) */

}
