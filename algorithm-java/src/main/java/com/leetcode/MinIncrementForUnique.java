package com.leetcode;

/**
 * leetcode.945
 * 给你一个整数数组 nums 。每次 move 操作将会选择任意一个满足 0 <= i < nums.length 的下标 i，并将 nums[i] 递增 1。
 * <p>
 * 返回使 nums 中的每个值都变成唯一的所需要的最少操作次数。
 *
 * @author clx
 */
public class MinIncrementForUnique {

	public static int minIncrementForUnique(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int max = 0;
		int[] counter = new int[50000];
		for (int num : nums) {
			counter[num]++;
			if (num > max) {
				max = num;
			}
		}
		int minMove = 0;
		for (int idx = 0; idx <= max; idx++) {
			if (counter[idx] > 1) {
				minMove += counter[idx] - 1;
				counter[idx + 1] += counter[idx] - 1;
			}
		}
		return minMove + counter[max + 1] * (counter[max + 1] - 1) / 2;
	}
}
