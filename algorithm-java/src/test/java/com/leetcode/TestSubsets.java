package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestSubsets {

	@Test
	public void testSubsets() {
		int[] array = new int[]{1, 2, 3};
		List<List<Integer>> result = Subsets.subset(array);
		System.out.println(result);
	}
}
