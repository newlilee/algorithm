package com.leetcode;

/**
 * leetcode 7.ReverseInteger
 *
 * @author clx
 */
public class ReverseInteger {

	/**
	 * brute force
	 *
	 * @param x
	 * @return
	 */
	public static int reverseBruteForce(int x) {
		if (x == 0) {
			return 0;
		}
		String content = String.valueOf(x);
		StringBuilder result = new StringBuilder(content.length());
		char firstChar = content.charAt(0);
		char lastChar = content.charAt(content.length() - 1);
		boolean isDigit = false;
		if (firstChar != '-') {
			isDigit = true;
		}
		if (!isDigit) {
			result.append(firstChar);
		}
		if (lastChar != 0) {
			result.append(lastChar);
		}
		for (int idx = content.length() - 2; idx >= 1; idx--) {
			result.append(content.charAt(idx));
		}
		if (isDigit) {
			result.append(firstChar);
		}
		return Integer.parseInt(result.toString());
	}

	/**
	 * @param x
	 * @return
	 */
	public static int reverse(int x) {
		if (x == 0) {
			return 0;
		}
		int result = 0;
		while (x != 0) {
			int popDigit = x % 10;
			x = x / 10;
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && popDigit > 7)) {
				return 0;
			}
			if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && popDigit < -8)) {
				return 0;
			}
			result = result * 10 + popDigit;
		}
		return result;
	}
}
