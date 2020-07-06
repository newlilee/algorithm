package com.leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author clx
 */
public class TestTwoSumTwo {

	@Test
	public void testTwoSum() {
		int[] array = new int[]{1, 3, 5, 7, 8, 10};
		int target = 8;
		int[] result = TwoSumTwo.twoSum(array, target);
		System.out.println("result:" + Arrays.toString(result));
	}
}
