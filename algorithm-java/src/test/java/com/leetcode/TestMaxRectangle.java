package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMaxRectangle {

	@Test
	public void testMaxRectangle() {
		// case 1
		char[][] caseOne = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
		System.out.println(MaxRectangle.maxRectangle(caseOne));

		// case 2
		char[][] caseTwo = {};
		System.out.println(MaxRectangle.maxRectangle(caseTwo));

		// case 3
		char[][] caseThree = {{'0'}};
		System.out.println(MaxRectangle.maxRectangle(caseThree));

		// case 4
		char[][] caseFour = {{'1'}};
		System.out.println(MaxRectangle.maxRectangle(caseFour));

		// case 5
		char[][] caseFive = {{'0', '0'}};
		System.out.println(MaxRectangle.maxRectangle(caseFive));
	}
}
