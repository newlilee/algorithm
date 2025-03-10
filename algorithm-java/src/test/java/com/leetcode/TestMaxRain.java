package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestMaxRain {

	@Test
	void testMaxRain() {
		// case 1
		int[] caseOneHeight = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(MaxRain.maxRainWithDoublePointer(caseOneHeight));

		// case 2
		int[] caseTwoHeight = { 1, 1 };
		System.out.println(MaxRain.maxRainWithDoublePointer(caseTwoHeight));

		// case 3
		int[] caseThreeHeight = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(MaxRain.maxRainWithDoublePointer(caseThreeHeight));
	}

	@Test
	void testMaxRainWithDeque() {
		// case 1
		int[] caseOneHeight = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(MaxRain.maxRainWithDeque(caseOneHeight));

		// case 2
		int[] caseTwoHeight = { 1, 1 };
		System.out.println(MaxRain.maxRainWithDeque(caseTwoHeight));

		// case 3
		int[] caseThreeHeight = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(MaxRain.maxRainWithDeque(caseThreeHeight));
	}
}
