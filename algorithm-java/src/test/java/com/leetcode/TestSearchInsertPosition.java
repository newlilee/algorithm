package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestSearchInsertPosition {

	@Test
	public void testSearch() {
		int[] array = new int[]{1, 3, 5, 6};
		int target = 5;
		int result = SearchInsertPosition.search(array, target);
		System.out.println("result:" + result);
	}
}
