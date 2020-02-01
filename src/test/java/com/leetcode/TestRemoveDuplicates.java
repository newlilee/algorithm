package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestRemoveDuplicates {

	@Test
	public void testRemove() {
		int[] array = new int[]{1, 2, 2, 3, 3, 4, 5, 5};
		int len = RemoveDuplicates.removeDuplicates(array);
		System.out.println("new length:" + len);
	}
}
