package com.examples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp {
	
	@Test(dataProvider = "kit-kat")
	public void testing(String value) {
		System.out.println("Passed parameter is: "+value);
		
	}
	
	@DataProvider(name="kit-kat")
	public Object[][] kitKatMethod(){
		return new Object[][] {{"first value"}, {"Second value"}};
		
	}

}
