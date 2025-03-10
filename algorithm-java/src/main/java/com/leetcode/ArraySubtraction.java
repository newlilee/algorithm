package com.leetcode;

/**
 * @author clx
 */
public class ArraySubtraction {

	/**
	 * array subtraction with bit mathematical
	 *
	 * @param firstArray
	 * @param secondArray
	 * @return
	 */
	public static char arraySubtractionWithBit(char[] firstArray, char[] secondArray) {
		if (firstArray.length == 1 && secondArray.length == 0) {
			return firstArray[0];
		}
		int result = 0;
		for (int idx = 0; idx < firstArray.length; idx++) {
			result = firstArray[idx] ^ secondArray[idx];
			if (result != 0) {
				result = firstArray[idx];
				break;
			}
		}
		return (char) result;
	}

	/**
	 * array subtraction
	 *
	 * @param firstArray
	 * @param secondArray
	 * @return
	 */
	public static char arraySubtraction(char[] firstArray, char[] secondArray) {
		if (firstArray.length == 1 && secondArray.length == 0) {
			return firstArray[0];
		}

		char result = 0;
		for (char ch : firstArray) {
			if (binarySearch(secondArray, ch) == -1) {
				result = ch;
				break;
			}
		}
		return result;
	}

	private static int binarySearch(char[] array, char target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target == array[mid]) {
				return mid;
			} else if (target < array[mid]) {
				high = mid - 1;
			} else if (target > array[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}
}
