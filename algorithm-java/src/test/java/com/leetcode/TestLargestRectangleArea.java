package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestLargestRectangleArea {

	@Test
	public void testLargestRectangleArea() {
		// case 1
		int[] caseOneHeights = { 2, 1, 5, 6, 2, 3 };
		System.out.println(LargestRectangleArea.largestRectangleAreaWithDeque(caseOneHeights));

		// case 2
		int[] caseTwoHeights = { 2, 4 };
		System.out.println(LargestRectangleArea.largestRectangleAreaWithDeque(caseTwoHeights));
	}
}
