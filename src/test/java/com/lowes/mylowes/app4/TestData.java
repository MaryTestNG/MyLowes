package com.lowes.mylowes.app4;

import org.testng.annotations.DataProvider;


public class TestData {
	
	@DataProvider(name = "logindata")
	public static Object[][] getData() {
		return new Object[][] { { "kiran", "pwd123" }, { "vijay", "test123" }, { "kumar", "abc123" } };
	}

}
