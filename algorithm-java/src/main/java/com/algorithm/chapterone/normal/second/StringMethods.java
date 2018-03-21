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
		String[] array = { "a", "b", "c" };
		System.out.println(isSorted(array));
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

	/**
	 * String array is sorted
	 * 
	 * @param array
	 * @return
	 */
	private static boolean isSorted(String[] array) {
		if (array == null || array.length == 0) {
			return false;
		}
		boolean flag = false;
		for (int idx = 1; idx < array.length; idx++) {
			if (array[idx - 1].compareTo(array[idx]) > 0) {
				flag = false;
			} else {
				flag = true;
			}
			flag &= flag;
		}
		return flag;
	}
}
