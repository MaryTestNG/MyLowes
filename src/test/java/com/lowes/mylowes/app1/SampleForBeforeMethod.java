package com.lowes.mylowes.app1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SampleForBeforeMethod {
	@Test
	public void testMethod1() {
		System.out.println("inside testMethod1()");
	}
	@Test
	public void testMethod2() {
		System.out.println("inside testMethod2()");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Mehtod called");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Mehtod called");
	}

}
