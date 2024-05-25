package com.leetcode;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

/**
 * @author clx 2019-05-16
 */
public class TestTwoSum {

	@Test
	void testAddTwoSum() {
		int[] array = new int[] { 1, 3, 5, 7, 10, 8 };
		int target = 8;
		int[] result = TwoSum.addTwoSum(array, target);
		System.out.println(Arrays.toString(result));
	}

	@Test
	void testTwoSumWithHash() {
		int[] array = new int[] { 1, 3, 5, 7, 10, 8 };
		int target = 8;
		int[] result = TwoSum.twoSumWithHash(array, target);
		System.out.println(Arrays.toString(result));
	}

	@Test
	void testTwoSumOnePassHash() {
		int[] array = new int[] { 1, 3, 5, 7, 10, 8 };
		int target = 8;
		int[] result = TwoSum.twoSumOnePassHash(array, target);
		System.out.println(Arrays.toString(result));
	}

	@Test
	void testTwoSum() {
		int[] array = new int[] { 1, 3, 5, 7, 10, 11, 8, 2 };
		int target = 9;
		List<List<Integer>> result = TwoSum.twoSum(array, target);
		result.forEach(System.out::println);
	}
}
