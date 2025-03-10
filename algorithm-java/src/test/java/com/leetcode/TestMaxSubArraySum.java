package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestMaxSubArraySum {

	@Test
	public void testMaxSubArraySum() {
		// case 1
		int[] caseOne = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(MaxSubArraySum.maxSubArraySum(caseOne));
		// case 2
		int[] caseTwo = { 1 };
		System.out.println(MaxSubArraySum.maxSubArraySum(caseTwo));
		// case 3
		int[] caseThree = { 5, 4, -1, 7, 8 };
		System.out.println(MaxSubArraySum.maxSubArraySum(caseThree));
	}
}
