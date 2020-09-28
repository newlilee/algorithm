package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestPermutations {

	@Test
	public void testPermutation() {
		int[] array = new int[]{1, 2, 3};
		List<List<Integer>> result = Permutations.permutations(array);
		System.out.println(result);
	}
}
