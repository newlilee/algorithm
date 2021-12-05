package com.leetcode.dynamic.programing;

import com.leetcode.util.ArrayUtils;

/**
 * @author clx
 */
public class CoinChange {

	/**
	 * dp
	 *
	 * @param coins  coins array
	 * @param amount money amount
	 * @return
	 */
	public static int coinChange(int[] coins, int amount) {
		if (ArrayUtils.checkArrayValid(coins)) {
			return 0;
		}
		if (amount < 0) {
			return -1;
		}
		if (amount == 0) {
			return 0;
		}
		int val = Integer.MAX_VALUE;
		for (int coin : coins) {
			int sub = coinChange(coins, amount - coin);
			if (sub == -1) {
				continue;
			}
			val = Math.min(val, sub + 1);
		}
		return val == Integer.MAX_VALUE ? -1 : val;
	}
}
