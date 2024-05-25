package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestCombinationSumTwo {

	@Test
	public void testCombinationSumTwo() {
		int[] array = new int[] { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<List<Integer>> result = CombinationSumTwo.combination(array, target);
		System.out.println(result);
	}
}
