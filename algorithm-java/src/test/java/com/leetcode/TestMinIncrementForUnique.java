package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestMinIncrementForUnique {

	@Test
	public void testMinIncrementForUnique() {
		// case 1
		int[] caseOne = { 1, 2, 2 };
		System.out.println(MinIncrementForUnique.minIncrementForUnique(caseOne));

		// case 2
		int[] caseTwo = { 3, 2, 1, 2, 1, 7 };
		System.out.println(MinIncrementForUnique.minIncrementForUnique(caseTwo));
	}
}
