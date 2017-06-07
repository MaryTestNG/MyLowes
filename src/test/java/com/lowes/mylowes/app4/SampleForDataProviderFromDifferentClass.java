package com.lowes.mylowes.app4;

import org.testng.annotations.Test;

public class SampleForDataProviderFromDifferentClass {

	@Test(dataProvider = "logindata", dataProviderClass=TestData.class)
	public void login(String uid, String pwd) {
		System.out.println(uid + "   " + pwd);
	}

}
