package com.leetcode;

import com.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestFindPositionElementSortedArray {

	@Test
	public void testFindPosition() {
		int[] array = new int[]{5, 7, 7, 8, 8, 8, 10};
		int target = 8;
		int[] result = FindPositionElementSortedArray.searchBruteForce(array, target);
		ArrayUtils.printArray(result);
	}

	@Test
	public void testBinaryFindPosition() {
		int[] array = new int[]{5, 7, 7, 8, 8, 8, 10};
		int target = 5;
		int[] result = FindPositionElementSortedArray.searchBinary(array, target);
		ArrayUtils.printArray(result);
	}
}
