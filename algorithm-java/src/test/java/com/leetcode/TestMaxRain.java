package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMaxRain {

	@Test
	void testMaxRain() {
		// case 1
		int[] caseOneHeight = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(MaxRain.maxRain(caseOneHeight));

		// case 2
		int[] caseTwoHeight = {1, 1};
		System.out.println(MaxRain.maxRain(caseTwoHeight));
	}
}
