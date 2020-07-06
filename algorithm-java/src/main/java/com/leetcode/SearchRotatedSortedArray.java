package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 33. Search in Rotated Sorted Array
 *
 * @author clx
 */
public class SearchRotatedSortedArray {

	/**
	 * search target
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public static int search(int[] array, int target) {
		if (ArrayUtils.checkArrayValid(array)) {
			return -1;
		}
		int lo = 0;
		int hi = array.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) >>> 1;
			if (array[mid] > array[hi]) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		if (array[lo] == target) {
			return lo;
		}
		int low = (target <= array[array.length - 1]) ? lo : 0;
		int high = (target > array[array.length - 1]) ? lo - 1 : array.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (array[mid] > target) {
				high = mid - 1;
			} else if (array[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
