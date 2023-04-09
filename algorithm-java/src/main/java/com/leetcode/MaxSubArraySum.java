package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 53.
 * 给你一个整数数组nums，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 子数组是数组中的一个连续部分。
 *
 * @author clx
 */
public class MaxSubArraySum {

	/**
	 * max sub array sum
	 *
	 * @param nums array
	 * @return sum
	 */
	public static int maxSubArraySum(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return -1;
		}
		int result = nums[0];
		int sum = 0;
		for (int num : nums) {
			if (sum > 0) {
				sum += num;
			} else {
				sum = num;
			}
			result = Math.max(result, sum);
		}
		return result;
	}
}
