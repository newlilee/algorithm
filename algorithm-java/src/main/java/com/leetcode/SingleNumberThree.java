package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 260. Single Number III Given an array of numbers nums, in which exactly two
 * elements appear only once and all the other elements appear exactly twice.
 * Find the two elements that appear only once.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,1,3,2,5] Output: [3,5] Note:
 * <p>
 * The order of the result is not important. So in the above example, [5, 3] is
 * also correct. Your algorithm should run in linear runtime complexity. Could
 * you implement it using only constant space complexity?
 *
 * @author clx
 */
public class SingleNumberThree {

	/**
	 * @param nums
	 * @return
	 */
	public static int[] singleNumber(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new int[] {};
		}

		int bitOne = 0;
		for (int num : nums) {
			bitOne ^= num;
		}

//		bitOne = bitOne & (~bitOne + 1);

		int bit = 1;
		while ((bitOne & 1) == 0) {
			bitOne >>= 1;
			bit <<= 1;
		}

		int firstEle = 0;
		int secondEle = 0;
		for (int num : nums) {
			if ((num & bit) == 0) {
				firstEle ^= num;
			} else {
				secondEle ^= num;
			}
		}
		return new int[] { firstEle, secondEle };
	}
}
