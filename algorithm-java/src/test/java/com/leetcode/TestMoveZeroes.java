package com.leetcode;

import java.util.Arrays;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestMoveZeroes {

	@Test
	public void testMoveZeroes() {
		// case 1
		int[] caseOne = { 0, 1, 0, 3, 12 };
		MoveZeroes.moveZeroes(caseOne);
		System.out.println(Arrays.toString(caseOne));

		// case 2
		int[] caseTwo = { 0 };
		MoveZeroes.moveZeroes(caseTwo);
		System.out.println(Arrays.toString(caseTwo));
	}
}
