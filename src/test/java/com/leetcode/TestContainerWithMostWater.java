package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestContainerWithMostWater {


	@Test
	public void testMaxAreaBruteForce() {
		int[] array = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
		int result = ContainerWithMostWater.maxAreaBruteForce(array);
		System.out.println("area:" + result);
	}

	@Test
	public void testContainer() {
		int[] array = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
		int result = ContainerWithMostWater.maxArea(array);
		System.out.println("area:" + result);
	}

}
