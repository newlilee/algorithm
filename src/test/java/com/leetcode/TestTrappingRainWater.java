package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestTrappingRainWater {

	@Test
	public void testTrappingBruteForce() {
		int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int result = TrappingRainWater.trapBruteForce(height);
		System.out.println("result:" + result);
	}
}
