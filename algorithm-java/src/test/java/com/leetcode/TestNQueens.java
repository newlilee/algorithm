package com.leetcode;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestNQueens {

	@Test
	public void testNQueens() {
		int n = 100;
		List<String[][]> result = NQueens.solveNQueens(n);
		for (String[][] res : result) {
			for (String[] r : res) {
				System.out.println(Arrays.toString(r));
			}
		}
	}
}
