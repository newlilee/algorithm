package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestThreeSum {

	@Test
	public void testThreeSum() {
		int[] array = new int[]{-1, 0, 1, 2, -1, -4};
		List<List<Integer>> result = ThreeSum.threeSum(array);
		System.out.println(result);
	}
}
