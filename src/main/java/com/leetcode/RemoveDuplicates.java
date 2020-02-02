package com.leetcode;

import com.leetcode.util.SortUtils;

/**
 * 26. Remove Duplicates from Sorted Array
 *
 * @author clx
 */
public class RemoveDuplicates {

	/**
	 * @param array
	 * @return
	 */
	public static int removeDuplicates(int[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		int idx = 0;
		for (int jdx = idx + 1; jdx < array.length; jdx++) {
			if (array[jdx] != array[idx]) {
				idx++;
				array[idx] = array[jdx];
			}
		}
		return idx + 1;
	}

	/**
	 * remove duplicates brute force
	 *
	 * @param array
	 * @return
	 */
	public static int removeDuplicatesBruteForce(int[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		int idx = 0;
		for (int jdx = 1; jdx < array.length; jdx++) {
			if (array[jdx] == array[jdx - 1]) {
				idx++;
			} else {
				array[jdx - idx] = array[jdx];
			}
		}
		return array.length - idx;
	}
}

