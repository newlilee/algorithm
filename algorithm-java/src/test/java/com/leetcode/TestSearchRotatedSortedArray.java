package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestSearchRotatedSortedArray {

	@Test
	public void testSearchArray() {
		int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
		int target = 0;
		int result = SearchRotatedSortedArray.search(array, target);
		System.out.println("result:" + result);
	}
}
