package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestCombinationSumTwo {

	@Test
	public void testCombinationSumTwo() {
		int[] array = new int[]{10, 1, 2, 7, 6, 1, 5};
		int target = 8;
		List<List<Integer>> result = CombinationSumTwo.combination(array, target);
		System.out.println(result);
	}
}
