package com.examples;

import org.testng.annotations.Test;

public class MyScriptForMultipleIRetry {
	
	@Test (retryAnalyzer = RetryAnalyzerExample.class)
	public void Test1() {
		System.out.println("Testing IRetry Analyzer");
		assert false; //Intentional fail
	}

}
