package com.leetcode;

import java.util.Arrays;

/**
 * leetcode.1991
 * 
 * @author clx
 */
public class FindMiddleIndex {

	public static int findMiddleIndex(int[] nums) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		for (int idx = 0; idx < nums.length; idx++) {
			if (sum(nums, 0, idx) == sum(nums, idx, nums.length - 1)) {
				return idx;
			}
		}
		return -1;
	}

	private static int sum(int[] nums, int startIdx, int endIdx) {
		int sum = 0;
		for (int idx = startIdx; idx <= endIdx; idx++) {
			sum += nums[idx];
		}
		return sum;
	}
}
