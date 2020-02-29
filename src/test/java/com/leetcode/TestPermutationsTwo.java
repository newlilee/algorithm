package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestPermutationsTwo {

	@Test
	public void testPermutationsTwo() {
		int[] array = new int[]{1, 1, 2};
		List<List<Integer>> result = PermutationsTwo.permutations(array);
		System.out.println(result);
	}
}
