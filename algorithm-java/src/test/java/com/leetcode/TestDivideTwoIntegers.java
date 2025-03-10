package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestDivideTwoIntegers {

	@Test
	public void testDivide() {
		int dividend = 15;
		int divisor = -5;
		int result = DivideTwoIntegers.divide(dividend, divisor);
		System.out.println("result:" + result);
	}
}
