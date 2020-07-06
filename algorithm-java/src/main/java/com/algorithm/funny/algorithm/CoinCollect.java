package com.algorithm.funny.algorithm;

/**
 * @author clx
 */
public class CoinCollect {

	/**
	 * @param coins
	 * @param amount
	 * @return
	 */
	public static int coinCollect(int[] coins, int amount) {
		if (amount < 0) {
			return -1;
		}
		if (amount == 0) {
			return 0;
		}
		int[] dp = new int[amount + 1];
		for (int idx = 1; idx < dp.length; idx++) {
			dp[idx] = idx;
		}
		for (int idx = 0; idx < dp.length; idx++) {
			for (int coin : coins) {
				if (idx - coin < 0) {
					continue;
				}
				dp[idx] = Math.min(dp[idx], 1 + dp[idx - coin]);
			}
		}
		return (dp[amount] == amount + 1) ? -1 : dp[amount];
	}
}
