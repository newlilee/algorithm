package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.util.ArrayUtils;

/**
 * @author clx
 */
public class TestSlidingWindowMaximum {

	@Test
	public void testSlidingWindowMaximumWithHeap() {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] result = SlidingWindowMaximum.maxSlidingWindowWithHeap(nums, k);
		ArrayUtils.printArray(result);
	}

	@Test
	public void testSlidingWindowMaximum() {
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int[] result = SlidingWindowMaximum.maxSlidingWindow(nums, k);
		ArrayUtils.printArray(result);
	}
}
