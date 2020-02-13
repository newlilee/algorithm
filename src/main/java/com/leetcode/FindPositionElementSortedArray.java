package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 *
 * @author clx
 */
public class FindPositionElementSortedArray {

	/**
	 * find first & last position of element
	 * brute force
	 *
	 * @param array
	 * @param target
	 */
	public static int[] searchBruteForce(int[] array, int target) {
		int[] result = new int[]{-1, -1};
		if (ArrayUtils.checkArrayValid(array)) {
			return result;
		}
		for (int idx = 0; idx < array.length; idx++) {
			if (target == array[idx]) {
				result[0] = idx;
				break;
			}
		}
		if (result[0] == -1) {
			return result;
		}
		for (int idx = array.length - 1; idx > 0; idx--) {
			if (target == array[idx]) {
				result[1] = idx;
				break;
			}
		}
		return result;
	}

	/**
	 * binary search
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public static int[] searchBinary(int[] array, int target) {
		int[] result = new int[]{-1, -1};
		int leftIdx = search(array, target, true);
		if (array[leftIdx] != target) {
			return result;
		}
		result[0] = leftIdx;
		result[1] = search(array, target, false);
		return result;
	}

	private static int search(int[] array, int target, boolean isLeft) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) >>> 1;
			if (array[mid] > target || (isLeft && array[mid] == target)) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}
