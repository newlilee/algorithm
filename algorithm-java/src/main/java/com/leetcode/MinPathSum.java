package com.leetcode;

/**
 * 64.
 * 给定一个包含非负整数的 m*n网格grid，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * <p>
 * 说明：每次只能向下或者向右移动一步。
 *
 * @author clx
 */
public class MinPathSum {

	/**
	 * min path sum
	 *
	 * @param grid m*n
	 * @return sum
	 */
	public static int minPathSum(int[][] grid) {
		for (int idx = 0; idx < grid.length; idx++) {
			for (int jdx = 0; jdx < grid[idx].length; jdx++) {
				if (idx == 0 && jdx == 0) {
					continue;
				} else if (idx == 0) {
					grid[idx][jdx] = grid[idx][jdx - 1] + grid[idx][jdx];
				} else if (jdx == 0) {
					grid[idx][jdx] = grid[idx - 1][jdx] + grid[idx][jdx];
				} else {
					grid[idx][jdx] = Math.min(grid[idx - 1][jdx], grid[idx][jdx - 1]) + grid[idx][jdx];
				}
			}
		}
		return grid[grid.length - 1][grid[0].length - 1];
	}
}
