package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 34. Find First and Last Position of Element in Sorted Array
 * 给你一个按照非递减顺序排列的整数数组nums，和一个目标值target。请你找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值target，返回[-1, -1]。
 *
 * @author clx
 */
public class FindPositionElementSortedArray {

	/**
	 * find first & last position of element brute force
	 *
	 * @param nums   sorted array
	 * @param target target num
	 * @return target idx
	 */
	public static int[] searchBruteForce(int[] nums, int target) {
		int[] result = new int[] { -1, -1 };
		if (ArrayUtils.checkArrayValid(nums)) {
			return result;
		}
		for (int idx = 0; idx < nums.length; idx++) {
			if (target == nums[idx]) {
				result[0] = idx;
				break;
			}
		}
		if (result[0] == -1) {
			return result;
		}
		for (int idx = nums.length - 1; idx >= 0; idx--) {
			if (target == nums[idx]) {
				result[1] = idx;
				break;
			}
		}
		return result;
	}

	/**
	 * binary search
	 *
	 * @param nums   sorted array
	 * @param target target num
	 * @return target idx
	 */
	public static int[] searchBinary(int[] nums, int target) {
		int[] result = new int[] { -1, -1 };
		if (nums == null || nums.length == 0) {
			return result;
		}
		int lo = 0;
		int hi = nums.length - 1;
		int mid = 0;
		while (lo < hi) {
			mid = lo + (hi - lo) / 2;
			if (nums[mid] < target) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		if (nums[lo] != target) {
			return result;
		}
		result[0] = lo;
		hi = nums.length - 1;
		while (lo < hi) {
			mid = lo + (hi - lo) / 2 + 1;
			if (nums[mid] > target) {
				hi = mid - 1;
			} else {
				lo = mid;
			}
		}
		result[1] = lo;
		return result;
	}
}
