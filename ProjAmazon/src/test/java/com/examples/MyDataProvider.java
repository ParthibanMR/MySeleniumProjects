package com.examples;

import org.testng.annotations.Test;

public class MyDataProvider {
	
	@Test(dataProvider = "data-provider", dataProviderClass = InheriteDataProvider.class)
	public void test1(String val) {
		System.out.println(val);
	}
	
	@Test (dataProvider = "Demo-APIExamples", dataProviderClass = InheriteDataProvider.class)
	public void test2(String val1, String val2) {
		System.out.println(val1 +": " +val2);
	}

}
