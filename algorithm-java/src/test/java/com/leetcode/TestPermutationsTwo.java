package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestPermutationsTwo {

	@Test
	public void testPermutationsTwo() {
		int[] array = new int[] { 1, 1, 2 };
		List<List<Integer>> result = PermutationsTwo.permutations(array);
		System.out.println(result);
	}
}
