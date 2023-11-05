package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 136. Single Number
 * <p>
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 *
 * @author clx
 */
public class SingleNumber {

	/**
	 * @param nums
	 * @return
	 */
	public static int singleNumber(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return -1;
		}

		int result = 0;
		for (int num : nums) {
			result ^= num;
		}
		return result;
	}
}
