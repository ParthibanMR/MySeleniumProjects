package com.examples;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerExample implements IRetryAnalyzer{
	int retryCount = 0;
    int maxRetryCount = 2;  // Retry 2 times (total 3 attempts)

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(retryCount<maxRetryCount) {
			retryCount++;
			return true;
		}
		return false;
		
	}

}
