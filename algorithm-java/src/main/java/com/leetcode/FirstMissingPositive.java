package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * leetcode.41 First Missing Positive
 * Given an unsorted integer array, find the smallest missing positive integer.
 *
 * @author clx
 */
public class FirstMissingPositive {

	/**
	 * @param nums array
	 * @return first missing positive
	 */
	public static int firstMissingPositive(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int idx = 0;
		while (idx < nums.length) {
			if (nums[idx] <= 0 || nums[idx] > nums.length || nums[nums[idx] - 1] == nums[idx]) {
				idx++;
			} else {
				ArrayUtils.exchange(nums, idx, nums[idx] - 1);
			}
		}
		idx = 0;
		while (idx < nums.length && nums[idx] == idx + 1) {
			idx++;
		}
		return idx + 1;
	}

	/**
	 * @param nums array
	 * @return first missing positive
	 */
	public static int firstMissingPositiveUsingHash(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int len = nums.length;
		int containsOne = 0;
		for (int ele : nums) {
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
			if (nums[idx] <= 0 || nums[idx] > len) {
				nums[idx] = 1;
			}
		}
		for (int idx = 0; idx < len; idx++) {
			int a = Math.abs(nums[idx]);
			if (a == len) {
				nums[0] = -Math.abs(nums[0]);
			} else {
				nums[a] = -Math.abs(nums[a]);
			}
		}
		for (int idx = 1; idx < len; idx++) {
			if (nums[idx] > 0) {
				return idx;
			}
		}
		if (nums[0] > 0) {
			return len;
		}
		return len + 1;
	}
}
