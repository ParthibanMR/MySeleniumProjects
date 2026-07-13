package com.examples;

import org.testng.annotations.DataProvider;

public class InheriteDataProvider {
	
	@DataProvider (name="data-provider")
	public Object[][] myMethod(){
		return new Object[][] {{"Value passed"},{"Whta is this"}};
		
	}
	
	@DataProvider (name="Demo-APIExamples")
	public Object[][] testing() {
		Object[][] obj = new Object[][] {{"ABC", "ABC123"},{"Mani", "new123"},{"Apr", "qwer"}};
	    return obj;
	}

}
