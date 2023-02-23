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
	 * @param nums   rotated array
	 * @param target rotated num
	 * @return rotated num idx
	 */
	public static int search(int[] nums, int target) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return -1;
		}
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) >>> 1;
			if (nums[mid] > nums[hi]) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		if (nums[lo] == target) {
			return lo;
		}
		int low = (target <= nums[nums.length - 1]) ? lo : 0;
		int high = (target > nums[nums.length - 1]) ? lo - 1 : nums.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (nums[mid] > target) {
				high = mid - 1;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
