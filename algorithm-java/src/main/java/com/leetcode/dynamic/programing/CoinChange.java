package com.leetcode.dynamic.programing;

import com.leetcode.util.ArrayUtils;

/**
 * @author clx
 */
public class CoinChange {

	/**
	 * dp
	 *
	 * @param coins
	 * @param amount
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
		int minNeededCoins = Integer.MAX_VALUE;
		for (int coin : coins) {
			int sub = coinChange(coins, amount - coin);
			if (sub == -1) {
				continue;
			}
			minNeededCoins = Math.min(minNeededCoins, sub + 1);
		}
		return minNeededCoins == Integer.MAX_VALUE ? -1 : minNeededCoins;
	}

	/**
	 * dp with dp table & recursive
	 *
	 * @param coins  coins array
	 * @param amount money amount
	 * @return
	 */
	public static int coinChangeWithRecursive(int[] coins, int amount) {
		int[] dpTable = new int[amount + 1];
		ArrayUtils.initArray(dpTable, amount + 1);
		return dpRecursive(dpTable, coins, amount);
	}

	/**
	 * dp recursive
	 *
	 * @param dpTable dp table
	 * @param coins   coins array
	 * @param amount  money amount
	 * @return
	 */
	private static int dpRecursive(int[] dpTable, int[] coins, int amount) {
		if (amount < 0) {
			return -1;
		}
		if (amount == 0) {
			return 0;
		}
		int minNeededCoins = Integer.MAX_VALUE;
		for (int coin : coins) {
			int sub = dpRecursive(dpTable, coins, amount - coin);
			if (sub == -1) {
				continue;
			}
			minNeededCoins = Math.min(minNeededCoins, sub + 1);
		}
		dpTable[amount] = (minNeededCoins == Integer.MAX_VALUE) ? -1 : minNeededCoins;
		return dpTable[amount];
	}

	/**
	 * dp with dp table & loop
	 *
	 * @param coins  coins array
	 * @param amount money amount
	 * @return
	 */
	public static int coinChangeWithLoop(int[] coins, int amount) {
		if (ArrayUtils.checkArrayValid(coins)) {
			return 0;
		}
		if (amount < 0) {
			return -1;
		}
		if (amount == 0) {
			return 0;
		}
		int[] dpTable = new int[amount + 1];
		ArrayUtils.initArray(dpTable, amount + 1);
		dpTable[0] = 0;
		for (int idx = 0; idx < amount + 1; idx++) {
			for (int coin : coins) {
				if (idx - coin < 0) {
					continue;
				}
				dpTable[idx] = Math.min(dpTable[idx], dpTable[idx - coin] + 1);
			}
		}
		return (dpTable[amount] == amount + 1) ? -1 : dpTable[amount];
	}
}
