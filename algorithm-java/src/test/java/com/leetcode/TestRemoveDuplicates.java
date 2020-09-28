package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestRemoveDuplicates {

	@Test
	public void testRemove() {
		int[] array = new int[]{1, 2, 2, 3, 3, 4, 5, 5};
		System.out.println("original len:" + array.length);
		int len = RemoveDuplicates.removeDuplicates(array);
		System.out.println("new length:" + len);
	}

	@Test
	public void testRemoveDuplicates() {
		int[] array = new int[]{1, 2, 2, 3, 3, 4, 5, 5};
		System.out.println("original len:" + array.length);
		int len = RemoveDuplicates.removeDuplicatesBruteForce(array);
		System.out.println("new length:" + len);
	}
}
