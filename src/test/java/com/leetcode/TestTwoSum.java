package com.leetcode;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author clx 2019-05-16
 */
public class TestTwoSum {

	@Test
	public void testAddTwoSum() {
		int[] array = new int[] { 1, 3, 5, 7, 10, 8 };
		int target = 8;
		int[] result = new TwoSum().addTwoSum(array, target);
		System.out.println(Arrays.toString(result));
	}

	@Test
	public void testTwoSumWithHash() {
		int[] array = new int[] { 1, 3, 5, 7, 10, 8 };
		int target = 8;
		int[] result = new TwoSum().twoSumWithHash(array, target);
		System.out.println(Arrays.toString(result));
	}

	@Test
	public void testTwoSumOnePassHash() {
		int[] array = new int[] { 1, 3, 5, 7, 10, 8 };
		int target = 8;
		int[] result = new TwoSum().twoSumOnePassHash(array, target);
		System.out.println(Arrays.toString(result));
	}
}
