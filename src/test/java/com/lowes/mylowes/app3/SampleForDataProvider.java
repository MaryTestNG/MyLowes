package com.lowes.mylowes.app3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleForDataProvider {

	@DataProvider(name = "logindata")
	public Object[][] getData() {
		return new Object[][] { { "kiran", "pwd123" }, { "vijay", "test123" }, { "kumar", "abc123" } };
	}

	@Test(dataProvider = "logindata")
	public void login(String uid, String pwd) {
		System.out.println(uid + "   " + pwd);
	}

}
