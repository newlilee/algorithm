package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestFirstMissingPositive {

	@Test
	public void testFistMissingPositive() {
//		int[] array = new int[]{1, 2, 0};
//		int[] array = new int[]{3, 4, -1, 1};
		int[] array = new int[]{7, 8, 9, 11, 12};
		int result = FirstMissingPositive.firstMissingPositive(array);
		System.out.println("result:" + result);
	}
}
