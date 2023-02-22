package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 31. Next Permutation
 *
 * @author clx
 */
public class NextPermutation {

	/**
	 * @param array array
	 */
	public static void nextPermutation(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return;
		}
		int idx = array.length - 2;
		while (idx >= 0 && array[idx + 1] <= array[idx]) {
			idx--;
		}
		if (idx >= 0) {
			int jdx = array.length - 1;
			while (jdx >= 0 && array[jdx] <= array[idx]) {
				jdx--;
			}
			// swap idx jdx
			swap(array, idx, jdx);
		}
		// reverse from idx+1
		reverse(array, idx + 1);
	}

	private static void swap(int[] array, int idx, int jdx) {
		int tmp = array[idx];
		array[idx] = array[jdx];
		array[jdx] = tmp;
	}

	private static void reverse(int[] array, int begin) {
		int startIdx = begin;
		int endIdx = array.length - 1;
		while (startIdx < endIdx) {
			swap(array, startIdx, endIdx);
			startIdx++;
			endIdx--;
		}
	}
}
