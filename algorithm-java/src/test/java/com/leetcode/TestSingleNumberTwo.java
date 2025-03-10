package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestSingleNumberTwo {

	@Test
	public void testSingleNumber() {
		int[] nums = { 0, 1, 0, 1, 0, 1, 99 };
		int result = SingleNumberTwo.singleNumber(nums);
		System.out.println("result:" + result);
	}

	@Test
	public void testSingleNumberWithBit() {
		int[] nums = { 0, 1, 0, 1, 0, 1, 99 };
		int result = SingleNumberTwo.singleNumberWithBit(nums);
		System.out.println("result:" + result);
	}
}
