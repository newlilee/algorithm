package com.leetcode;

/**
 * 70. 假设你正在爬楼梯。需要n阶你才能到达楼顶。
 * <p>
 * 每次你可以爬1或2个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * @author clx
 */
public class ClimbStairs {

	/**
	 * climb stairs
	 *
	 * @param n stairs num
	 * @return climb step
	 */
	public static int climbStairs(int n) {
		if (n <= 1) {
			return n;
		}
		int n1 = 1;
		int steps = 2;
		int temp;
		for (int idx = 3; idx <= n; idx++) {
			temp = n1;
			n1 = steps;
			steps = n1 + temp;
		}
		return steps;
	}

	/**
	 * climb stairs with dp
	 *
	 * @param n stairs num
	 * @return climb step
	 */
	public static int climbStairsWithDp(int n) {
		if (n <= 1) {
			return n;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int idx = 3; idx <= n; idx++) {
			dp[idx] = dp[idx - 1] + dp[idx - 2];
		}
		return dp[n];
	}
}
