package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestFirstMissingPositive {

	@Test
	public void testFistMissingPositive() {
		int[] caseOne = new int[]{1, 2, 0};
		System.out.println(FirstMissingPositive.firstMissingPositive(caseOne));
		int[] caseTwo = new int[]{3, 4, -1, 1};
		System.out.println(FirstMissingPositive.firstMissingPositive(caseTwo));
		int[] caseThree = new int[]{7, 8, 9, 11, 12};
		System.out.println(FirstMissingPositive.firstMissingPositive(caseThree));
	}

	@Test
	public void testFirstMissingPositiveUsingHash() {
		int[] caseOne = new int[]{1, 2, 0};
		System.out.println(FirstMissingPositive.firstMissingPositiveUsingHash(caseOne));
		int[] caseTwo = new int[]{3, 4, -1, 1};
		System.out.println(FirstMissingPositive.firstMissingPositiveUsingHash(caseTwo));
		int[] caseThree = new int[]{7, 8, 9, 11, 12};
		System.out.println(FirstMissingPositive.firstMissingPositiveUsingHash(caseThree));
	}
}
