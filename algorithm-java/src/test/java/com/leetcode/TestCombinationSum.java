package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestCombinationSum {

	@Test
	public void testCombine() {
		int[] array = new int[]{2, 3, 6, 7};
		int target = 7;
		List<List<Integer>> result = CombinationSum.combine(array, target);
		System.out.println(result);
	}
}
