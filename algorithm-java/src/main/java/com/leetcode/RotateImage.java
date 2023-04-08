package com.leetcode;

/**
 * 48.
 * 给定一个n×n的二维矩阵matrix表示一个图像。请你将图像顺时针旋转90度。
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 *
 * @author clx
 */
public class RotateImage {

	/**
	 * rotate image
	 *
	 * @param matrix matrix
	 */
	public static void rotateImage(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return;
		}

		int matrixLen = matrix.length;
		// 反斜杠方向翻转
		for (int idx = 0; idx < matrixLen; idx++) {
			for (int jdx = idx; jdx < matrixLen; jdx++) {
				if (idx != jdx) {
					int tmp = matrix[idx][jdx];
					matrix[idx][jdx] = matrix[jdx][idx];
					matrix[jdx][idx] = tmp;
				}
			}
		}
		// 左右翻转
		for (int idx = 0; idx < matrixLen; idx++) {
			for (int jdx = 0; jdx < matrixLen / 2; jdx++) {
				int tmp = matrix[idx][jdx];
				matrix[idx][jdx] = matrix[idx][matrixLen - 1 - jdx];
				matrix[idx][matrixLen - 1 - jdx] = tmp;
			}
		}
	}
}
