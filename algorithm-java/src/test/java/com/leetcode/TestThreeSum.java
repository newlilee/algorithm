package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestThreeSum {

	@Test
	void testThreeSum() {
		// case 1
		int[] caseOneArray = new int[] { -1, 0, 1, 2, -1, -4 };
		System.out.println(ThreeSum.threeSum(caseOneArray));
		// case 2
		int[] caseTwoArray = new int[] { 0, 1, 1 };
		System.out.println(ThreeSum.threeSum(caseTwoArray));
		// case 3
		int[] caseThreeArray = new int[] { 0, 0, 0, 0 };
		System.out.println(ThreeSum.threeSum(caseThreeArray));
	}
}
