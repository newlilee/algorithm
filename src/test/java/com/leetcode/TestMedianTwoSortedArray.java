package com.leetcode;

import org.junit.Test;

public class TestMedianTwoSortedArray {

	@Test
	public void testMedianOfBruteForce() {
		int[] firstArr = new int[]{1, 2};
		int[] secondArr = new int[]{3, 4};
		double result = MedianTwoSortedArray.medianOfBruteForce(firstArr, secondArr);
		System.out.println(result);
	}
}
