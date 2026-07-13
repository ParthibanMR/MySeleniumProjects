package com.examples;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	 protected WebDriver driver;

	 @Parameters("browser")
	 @BeforeMethod(alwaysRun = true)
	 public void setUp(String browser) {
	        if (browser.equalsIgnoreCase("chrome")) {
	            WebDriverManager.chromedriver().setup();
	            ChromeOptions options = new ChromeOptions();
	            options.addArguments("--remote-allow-origins=*");
	            driver = new ChromeDriver(options);
	        } else if (browser.equalsIgnoreCase("edge")) {
	            WebDriverManager.edgedriver().driverVersion("138.0.0").setup();
	            EdgeOptions options = new EdgeOptions();
	            options.addArguments("--remote-allow-origins=*");
	            driver = new EdgeDriver(options);
	        } else {
	            throw new IllegalArgumentException("Browser not supported: " + browser);
	        }
	        driver.manage().window().maximize();
	        driver.get("https://www.flipkart.com");
	    }

	    @AfterMethod(alwaysRun = true)
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }



}
