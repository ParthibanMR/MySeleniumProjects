package com.examples;

import org.testng.annotations.Test;

public class MyScriptForIRetry {
	
	@Test (retryAnalyzer = RetryAnalyzerExample.class)
	public void Test1() {
		System.out.println("Testing IRetry Analyzer");
		assert false; //Intentional fail
	}
	@Test
	public void Test2() {
		System.out.println("Testing IRetry Analyzer test2");
		assert true; 
	}
	@Test
	public void Test3() {
		System.out.println("Testing IRetry Analyzer test3");
		assert false; 
	}

}
