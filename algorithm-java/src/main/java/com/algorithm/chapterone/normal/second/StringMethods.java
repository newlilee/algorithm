package com.algorithm.chapterone.normal.second;

/**
 * String methods
 * 
 * @author clx 2018/3/21.
 */
public class StringMethods {

	public static void main(String[] args) {
		String target = "abcdefdcba";
		System.out.println(isPalindrome(target));
	}

	/**
	 * string is palindrome
	 * 
	 * @param target
	 * @return
	 */
	private static boolean isPalindrome(String target) {
		if (target == null || target.length() == 0) {
			return false;
		}
		int length = target.length();
		for (int idx = 0; idx < length / 2; idx++) {
			if (target.charAt(idx) != target.charAt(length - idx - 1)) {
				return false;
			}
		}
		return true;
	}
}
