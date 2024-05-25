package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestMinPathSum {

	@Test
	public void testMinPathSum() {
		// case 1
		int[][] caseOne = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
		System.out.println(MinPathSum.minPathSum(caseOne));
		// case 2
		int[][] caseTwo = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(MinPathSum.minPathSum(caseTwo));
	}
}
