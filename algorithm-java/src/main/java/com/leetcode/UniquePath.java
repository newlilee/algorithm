package com.leetcode;

/**
 * 62.
 *
 * @author clx
 */
public class UniquePath {

	/**
	 * all possible path
	 *
	 * @param m m
	 * @param n n
	 * @return paths
	 */
	public static int uniquePath(int m, int n) {
		int[][] dp = new int[m][n];
		for (int idx = 0; idx < m; idx++) {
			for (int jdx = 0; jdx < n; jdx++) {
				if (idx == 0 || jdx == 0) {
					dp[idx][jdx] = 1;
				} else {
					dp[idx][jdx] = dp[idx - 1][jdx] + dp[idx][jdx - 1];
				}
			}
		}
		return dp[m - 1][n - 1];
	}
}
