package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestSingleNumber {

	@Test
	public void testSingleNumber() {
		int[] nums = new int[]{4, 1, 2, 1, 2};
		int result = SingleNumber.singleNumber(nums);
		System.out.println("result:" + result);
	}
}
