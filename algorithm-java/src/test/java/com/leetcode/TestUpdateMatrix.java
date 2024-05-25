package com.leetcode;

import java.util.Arrays;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestUpdateMatrix {

	@Test
	public void testUpdateMatrix() {
		// case 1
		int[][] caseOne = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(Arrays.deepToString(UpdateMatrix.updateMatrix(caseOne)));

		// case 2
		int[][] caseTwo = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		System.out.println(Arrays.deepToString(UpdateMatrix.updateMatrix(caseTwo)));
	}

	@Test
	public void testUpdateMatrixWithDp() {
		// case 1
		int[][] caseOne = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(Arrays.deepToString(UpdateMatrix.updateMatrixWithDp(caseOne)));

		// case 2
		int[][] caseTwo = { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } };
		System.out.println(Arrays.deepToString(UpdateMatrix.updateMatrixWithDp(caseTwo)));
	}
}
