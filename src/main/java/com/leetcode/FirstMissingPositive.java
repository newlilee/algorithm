package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 41. First Missing Positive
 * Given an unsorted integer array, find the smallest missing positive integer.
 *
 * @author clx
 */
public class FirstMissingPositive {

	/**
	 * @param array
	 * @return
	 */
	public static int firstMissingPositive(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return -1;
		}
		int idx = 0;
		while (idx < array.length) {
			if (array[idx] == idx + 1 || array[idx] <= 0 || array[idx] > array.length) {
				idx++;
			} else if (array[array[idx] - 1] != array[idx]) {
				ArrayUtils.exchange(array, idx, array[idx] - 1);
			} else {
				idx++;
			}
		}
		idx = 0;
		while (idx < array.length && array[idx] == idx + 1) {
			idx++;
		}
		return idx + 1;
	}
}
