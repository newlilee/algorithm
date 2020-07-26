package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 137. Single Number II
 * Given a non-empty array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 * <p>
 * Note:
 * <p>
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * @author clx
 */
public class SingleNumberTwo {

	/**
	 * @param nums
	 * @return
	 */
	public static int singleNumberWithBit(int[] nums) {
		int a = 0;
		int b = 0;
		for (int num : nums) {
			a = (a ^ num) & ~b;
			b = (b ^ num) & ~a;
		}
		return a;
	}

	/**
	 * @param nums
	 * @return
	 */
	public static int singleNumber(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return -1;
		}

		int ret = 0;
		for (int i = 0; i < 32; i++) {
			int mask = 1 << i;
			int cnt = 0;
			for (int num : nums) {
				if ((num & mask) != 0) {
					cnt++;
				}
			}
			if (cnt % 3 != 0) {
				ret |= mask;
			}
		}
		return ret;
	}
}
