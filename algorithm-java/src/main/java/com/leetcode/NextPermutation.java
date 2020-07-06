package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 31. Next Permutation
 *
 * @author clx
 */
public class NextPermutation {

	/**
	 * @param array
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
			swap(array, idx, jdx);
		}
		reverse(array, idx + 1);
	}

	/**
	 * swap
	 *
	 * @param array
	 * @param idx
	 * @param jdx
	 */
	private static void swap(int[] array, int idx, int jdx) {
		int tempEle = array[idx];
		array[idx] = array[jdx];
		array[jdx] = tempEle;
	}

	/**
	 * reverse array
	 *
	 * @param array
	 * @param beginIdx
	 */
	private static void reverse(int[] array, int beginIdx) {
		int startIdx = beginIdx;
		int endIdx = array.length - 1;
		while (startIdx < endIdx) {
			swap(array, startIdx, endIdx);
			startIdx++;
			endIdx--;
		}
	}
}
