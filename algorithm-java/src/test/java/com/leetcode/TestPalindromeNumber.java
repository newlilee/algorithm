package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestPalindromeNumber {

	@Test
	public void test() {
		int x = 12321;
		boolean result = PalindromeNumber.isPalindrome(x);
		System.out.println(result);
	}
}
