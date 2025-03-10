package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 88. Merge Sorted Array
 *
 * @author clx
 */
public class MergeSortedArray {

	/**
	 * @param firstArray
	 * @param m
	 * @param secondArray
	 * @param n
	 * @return
	 */
	public static int[] mergeSortedArray(int[] firstArray, int m, int[] secondArray, int n) {
		if (ArrayUtils.checkArrayValid(firstArray) && ArrayUtils.checkArrayValid(secondArray)) {
			return new int[0];
		}
		if (ArrayUtils.checkArrayValid(firstArray)) {
			return secondArray;
		}
		if (ArrayUtils.checkArrayValid(secondArray)) {
			return firstArray;
		}
		int idx = m - 1;
		int jdx = n - 1;
		int k = m + n - 1;
		while (jdx >= 0) {
			if (idx < 0 || firstArray[idx] <= secondArray[jdx]) {
				firstArray[k--] = secondArray[jdx--];
			} else {
				firstArray[k--] = firstArray[idx--];
			}
		}
		return firstArray;
	}
}
