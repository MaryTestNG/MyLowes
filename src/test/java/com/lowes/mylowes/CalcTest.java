package com.lowes.mylowes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTest {

	@Test
	public void testAdd() {
		Calc obj = new Calc();
		int actual = obj.add(1, 2);
		Assert.assertEquals(actual, 3);
	}

	@Test
	public void testAddStrings() {
		Calc obj = new Calc();
		String actual = obj.addStrings("kiran", "kumar");
		Assert.assertEquals(actual, "kirankumar");
	}

	@Test
	public void testGetMarks() {
		int[] expected = { 23, 24, 25 };
		Calc obj = new Calc();
		int[] actual = obj.getMarks();
		Assert.assertEquals(actual, expected);
	}
}
