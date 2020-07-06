package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestRemoveElement {

	@Test
	public void testRemove() {
		int[] array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
		int result = RemoveElement.removeElement(array, 2);
		System.out.println("result:" + result);
	}
}
