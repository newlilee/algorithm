package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 55.
 * 给定一个非负整数数组nums，你最初位于数组的第一个下标 。
 * <p>
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * <p>
 * 判断你是否能够到达最后一个下标。
 *
 * @author clx
 */
public class JumpGame {

	/**
	 * jump
	 *
	 * @param nums array
	 * @return bool
	 */
	public static boolean canJump(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return false;
		}
		int len = nums.length;
		int maxPos = 0;
		for (int idx = 0; idx < len; idx++) {
			int rightMost = idx + nums[idx];
			if (maxPos >= idx && rightMost > maxPos) {
				maxPos = rightMost;
			}
		}
		return maxPos >= len - 1;
	}
}
