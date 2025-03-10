package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.util.ArrayUtils;

/**
 * @author clx
 */
public class TestMergeSortedArray {

	@Test
	public void testMergeSortedArray() {
		int[] firstArray = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] secondArray = new int[] { 2, 5, 6 };
		int m = 3;
		int n = 3;
		int[] result = MergeSortedArray.mergeSortedArray(firstArray, m, secondArray, n);
		ArrayUtils.printArray(result);
	}
}
