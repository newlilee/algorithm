package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * leetcode.542
 * 给定一个由 0 和 1 组成的矩阵 mat，请输出一个大小相同的矩阵，其中每一个格子是 mat 中对应位置元素到最近的 0 的距离。
 * <p>
 * 两个相邻元素间的距离为 1 。
 *
 * @author clx
 */
public class UpdateMatrix {

	/**
	 * update matrix with bfs
	 *
	 * @param matrix origin matrix
	 * @return updated matrix
	 */
	public static int[][] updateMatrix(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return new int[][]{};
		}
		Queue<int[]> queue = new LinkedList<>();
		int m = matrix.length;
		int n = matrix[0].length;
		for (int idx = 0; idx < m; idx++) {
			for (int jdx = 0; jdx < n; jdx++) {
				if (matrix[idx][jdx] == 0) {
					queue.offer(new int[]{idx, jdx});
				} else {
					matrix[idx][jdx] = -1;
				}
			}
		}
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		while (!queue.isEmpty()) {
			int[] point = queue.poll();
			int x = point[0];
			int y = point[1];
			for (int idx = 0; idx < 4; idx++) {
				int newX = x + dx[idx];
				int newY = y + dy[idx];
				if (newX >= 0 && newX < m && newY >= 0 && newY < n && matrix[newX][newY] == -1) {
					matrix[newX][newY] = matrix[x][y] + 1;
					queue.offer(new int[]{newX, newY});
				}
			}
		}
		return matrix;
	}

	/**
	 * update matrix with dp
	 *
	 * @param matrix origin matrix
	 * @return updated matrix
	 */
	public static int[][] updateMatrixWithDp(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return new int[][]{};
		}
		int m = matrix.length;
		int n = matrix[0].length;
		int[][] dp = new int[m][n];
		for (int idx = 0; idx < m; idx++) {
			for (int jdx = 0; jdx < n; jdx++) {
				dp[idx][jdx] = matrix[idx][jdx] == 0 ? 0 : 10000;
			}
		}
		for (int idx = 0; idx < m; idx++) {
			for (int jdx = 0; jdx < n; jdx++) {
				if (idx - 1 >= 0) {
					dp[idx][jdx] = Math.min(dp[idx][jdx], dp[idx - 1][jdx] + 1);
				}
				if (jdx - 1 >= 0) {
					dp[idx][jdx] = Math.min(dp[idx][jdx], dp[idx][jdx - 1] + 1);
				}
			}
		}
		for (int idx = m - 1; idx >= 0; idx--) {
			for (int jdx = n - 1; jdx >= 0; jdx--) {
				if (idx + 1 < m) {
					dp[idx][jdx] = Math.min(dp[idx][jdx], dp[idx + 1][jdx] + 1);
				}
				if (jdx + 1 < n) {
					dp[idx][jdx] = Math.min(dp[idx][jdx], dp[idx][jdx + 1] + 1);
				}
			}
		}
		return dp;
	}
}
