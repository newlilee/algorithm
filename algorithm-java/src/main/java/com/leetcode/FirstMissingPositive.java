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
			if (array[idx] <= 0 || array[idx] > array.length || array[array[idx] - 1] == array[idx]) {
				idx++;
			} else {
				ArrayUtils.exchange(array, idx, array[idx] - 1);
			}
		}
		idx = 0;
		while (idx < array.length && array[idx] == idx + 1) {
			idx++;
		}
		return idx + 1;
	}

	/**
	 * @param array
	 * @return
	 */
	public static int firstMissingPositiveUsingHash(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return -1;
		}

		int len = array.length;
		int containsOne = 0;
		for (int ele : array) {
			if (ele == 1) {
				containsOne++;
				break;
			}
		}
		if (containsOne == 0) {
			return 1;
		}

		if (len == 1) {
			return 2;
		}

		for (int idx = 0; idx < len; idx++) {
			if (array[idx] <= 0 || array[idx] > len) {
				array[idx] = 1;
			}
		}

		for (int idx = 0; idx < len; idx++) {
			int a = Math.abs(array[idx]);
			if (a == len) {
				array[0] = -Math.abs(array[0]);
			} else {
				array[a] = -Math.abs(array[a]);
			}
		}

		for (int idx = 1; idx < len; idx++) {
			if (array[idx] > 0) {
				return idx;
			}
		}

		if (array[0] > 0) {
			return len;
		}

		return len + 1;
	}
}
