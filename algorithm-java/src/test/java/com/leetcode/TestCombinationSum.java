package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestCombinationSum {

	@Test
	void testCombine() {
		// case 1
		int[] caseOne = new int[] { 2, 3, 6, 7 };
		System.out.println(CombinationSum.combine(caseOne, 7));
		// case 2
		int[] caseTwo = new int[] { 2, 3, 5 };
		System.out.println(CombinationSum.combine(caseTwo, 8));
		// case 3
		int[] caseThree = new int[] { 2 };
		System.out.println(CombinationSum.combine(caseThree, 1));
	}
}
