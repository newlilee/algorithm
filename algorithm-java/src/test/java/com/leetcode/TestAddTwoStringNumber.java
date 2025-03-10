package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestAddTwoStringNumber {

	@Test
	void testAddTwoNumber() {
		String first = "987";
		String second = "9234";
		String result = AddTwoStringNumber.addTwoNumber(first, second);
		System.out.println("result:" + result);
	}
}
