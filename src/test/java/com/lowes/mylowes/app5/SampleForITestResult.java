package com.lowes.mylowes.app5;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleForITestResult {
	@Test
	public void testMethod1() {
		Assert.assertTrue(false);
	}

	@Test
	public void testMethod2() {
		Assert.assertTrue(true);
	}

	@AfterMethod
	public void afterMethod(ITestResult testResult) {
		if(testResult.getStatus() == ITestResult.FAILURE){
			System.out.println("Failed " + testResult.getMethod().getMethodName());
		}else if (testResult.getStatus() == ITestResult.SUCCESS){
			System.out.println("Success " + testResult.getName());
		}
	
	}

}
