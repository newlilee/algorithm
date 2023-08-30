package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMaxProfit {

	@Test
	public void testMaxProfit() {
		// case 1
		int[] caseOne = {7, 1, 5, 3, 6, 4};
		System.out.println(MaxProfit.maxProfit(caseOne));

		// case 2
		int[] caseTwo = {7, 6, 4, 3, 1};
		System.out.println(MaxProfit.maxProfit(caseTwo));
	}
}
