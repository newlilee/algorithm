package com.leetcode;

import org.testng.annotations.Test;

/**
 * test ReverseInteger
 *
 * @author clx
 */
public class TestReverseInteger {

	@Test
	public void testReverseInteger() {
		int x = -123450;
		int result = ReverseInteger.reverseBruteForce(x);
		System.out.println(result);
	}

	@Test
	public void testReverse() {
		int x = -123450;
		int result = ReverseInteger.reverse(x);
		System.out.println(result);
	}
}
