package com.leetcode;

import org.junit.Test;

/**
 * @author clx 4/13/2019
 */
public class TestSecondLargest {

	@Test
	public void testFindSecondLargest() {
		int[] array = new int[]{-1, 5, 7, 6, 1, 4, 3, 2};
		System.out.println(SecondLargest.findSecondLargest(array));
	}

	@Test
	public void testFindSecondMax() {
		int[] array = new int[]{-1, 5, 7, 6, 1, 4, 3, 2};
		System.out.println(new SecondLargest().findSecondMax(array));
	}
}
