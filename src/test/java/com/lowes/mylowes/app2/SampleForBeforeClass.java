package com.lowes.mylowes.app2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleForBeforeClass {
	@Test
	public void testMethod1() {
		System.out.println("inside testMethod1()");
	}
	@Test
	public void testMethod2() {
		System.out.println("inside testMethod2()");
	}

	@BeforeClass
	public void beforeMethod() {
		System.out.println("Before Class called");
	}

	@AfterClass
	public void afterMethod() {
		System.out.println("After Class called");
	}

}
