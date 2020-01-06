package com.leetcode;

/**
 * leetcode 9.PalindromeNumber
 *
 * @author clx
 */
public class PalindromeNumber {

	/**
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		int digit = x;
		if (digit < 0) {
			return false;
		}
		int result = 0;
		while (digit != 0) {
			int popDigit = digit % 10;
			digit = digit / 10;
			result = result * 10 + popDigit;
		}
		return result == x;
	}
}
