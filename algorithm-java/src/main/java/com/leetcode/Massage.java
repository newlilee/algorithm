package com.leetcode;

/**
 * leetcode 17.16 massage
 * 一个有名的按摩师会收到源源不断的预约请求，每个预约都可以选择接或不接。在每次预约服务之间要有休息时间，因此她不能接受相邻的预约。
 * 给定一个预约请求序列，替按摩师找到最优的预约集合（总预约时间最长），返回总的分钟数。
 *
 * @author clx
 */
public class Massage {

	public static int massage(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		int len = nums.length;
		int[] dp = new int[len];
		dp[0] = nums[0];
		dp[1] = Math.max(dp[0], nums[1]);
		for (int idx = 2; idx < len; idx++) {
			dp[idx] = Math.max(dp[idx - 1], dp[idx - 2] + nums[idx]);
		}
		return dp[len - 1];
	}

	public static int massageEnhance(int[] nums) {
		if (nums == null) {
			return 0;
		}
		// n-2
		int a = 0;
		// n-1
		int b = 0;
		for (int num : nums) {
			int c = Math.max(b, a + num);
			a = b;
			b = c;
		}
		return b;
	}
}
