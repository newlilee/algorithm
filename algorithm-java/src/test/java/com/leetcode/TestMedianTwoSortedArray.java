package com.leetcode;

import org.testng.annotations.Test;

public class TestMedianTwoSortedArray {

	@Test
	void testMedianOfBruteForce() {
		int[] firstArr = new int[] { 1, 2 };
		int[] secondArr = new int[] { 3, 4 };
		double result = MedianTwoSortedArray.medianOfBruteForce(firstArr, secondArr);
		System.out.println("result:" + result);
	}

	@Test
	void testMedianOfSortedArr() {
		int[] firstArr = new int[] { 1, 2, 3, 4 };
		int[] secondArr = new int[] { 3, 4, 5 };
		double result = MedianTwoSortedArray.medianOfSortedArr(firstArr, secondArr);
		System.out.println("result:" + result);
	}
}
