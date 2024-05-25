package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestSubsetsTwo {

	@Test
	public void testSubsets() {
		int[] array = new int[] { 1, 2, 2 };
		List<List<Integer>> result = SubsetsTwo.subset(array);
		System.out.println(result);
	}
}
