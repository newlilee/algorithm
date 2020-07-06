package com.algorithm.funny.algorithm;

import org.junit.Test;

/**
 * @author clx
 */
public class TestCoinCollect {

	@Test
	public void testCoinCollect() {
		int[] coins = new int[]{1, 2, 5};
		int amount = 11;
		int result = CoinCollect.coinCollect(coins, amount);
		System.out.println("result:" + result);
	}
}
