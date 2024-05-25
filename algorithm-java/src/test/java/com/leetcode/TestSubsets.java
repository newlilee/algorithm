package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestSubsets {

	@Test
	public void testSubsets() {
		// case 1
		int[] caseOne = new int[] { 1, 2, 3 };
		System.out.println(Subsets.subset(caseOne));

		// case 2
		int[] caseTwo = new int[] { 0 };
		System.out.println(Subsets.subset(caseTwo));
	}
}
