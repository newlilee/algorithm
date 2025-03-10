package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 35. Search Insert Position
 *
 * @author clx
 */
public class SearchInsertPosition {

	/**
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
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (target == array[mid]) {
				return mid;
			} else if (array[mid] < target) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return lo;
	}
}
