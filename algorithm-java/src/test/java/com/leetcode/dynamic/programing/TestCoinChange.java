package com.leetcode.dynamic.programing;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestCoinChange {

	@Test
	public void testCoinChange() {
		int[] coins = new int[] { 1, 2, 5 };
		int amount = 11;
		int result = CoinChange.coinChange(coins, amount);
		System.out.println("result:" + result);
	}

	@Test
	public void testCoinChangeWithRecursive() {
		int[] coins = new int[] { 1, 2, 5 };
		int amount = 11;
		int result = CoinChange.coinChangeWithRecursive(coins, amount);
		System.out.println("result:" + result);
	}

	@Test
	public void testCoinChangeWithLoop() {
		int[] coins = new int[] { 1, 2, 5 };
		int amount = 11;
		int result = CoinChange.coinChangeWithLoop(coins, amount);
		System.out.println("result:" + result);
	}
}
