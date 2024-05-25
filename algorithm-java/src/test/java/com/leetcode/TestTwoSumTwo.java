package com.leetcode;

import java.util.Arrays;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestTwoSumTwo {

	@Test
	void testTwoSum() {
		// case 1
		int[] caseOneArray = new int[] { 2, 7, 11, 15 };
		System.out.println("result:" + Arrays.toString(TwoSumTwo.twoSum(caseOneArray, 9)));
		// case 2
		int[] caseTwoArray = new int[] { 2, 3, 4 };
		System.out.println("result:" + Arrays.toString(TwoSumTwo.twoSum(caseTwoArray, 6)));
		// case 3
		int[] caseThreeArray = new int[] { -1, 0 };
		System.out.println("result:" + Arrays.toString(TwoSumTwo.twoSum(caseThreeArray, -1)));
	}
}
