package com.examples;

import org.testng.annotations.Test;

public class CrossBrowserAndParallel extends BaseTest{
	
	@Test(groups = "login")
    public void loginTest() {
        System.out.println("🟢 Running Login Test on: " + driver.getTitle());
        // Simulate login validation
    }
	
	@Test(groups = "search")
    public void searchTest() {
        System.out.println("🔍 Running Search Test on: " + driver.getTitle());
        // Simulate search box input
    }
	
	@Test(groups = {"login", "search"})
    public void commonTest() {
        System.out.println("✅ Running Common Test on: " + driver.getTitle());
        // For common functionality
    }

}
