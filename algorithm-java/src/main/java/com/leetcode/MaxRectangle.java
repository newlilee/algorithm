package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * leetcode 85. 给定一个仅包含 0 和 1 、大小为 rows x cols 的二维二进制矩阵，找出只包含 1 的最大矩形，并返回其面积。
 *
 * @author clx
 */
public class MaxRectangle {

	/**
	 * 按层计算以当前层为Y轴的最大面积
	 *
	 * @param matrix matrix array
	 * @return max area
	 */
	public static int maxRectangle(char[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) {
			return 0;
		}
		// Y轴
		int col = matrix.length;
		// X轴
		int row = matrix[0].length;
		int[] heights = new int[row];
		int maxArea = 0;
		for (char[] chars : matrix) {
			for (int jdx = 0; jdx < row; jdx++) {
				if (chars[jdx] == '1') {
					heights[jdx] += 1;
				} else {
					heights[jdx] = 0;
				}
			}
			maxArea = Math.max(maxArea, largestRectangleArea(heights));
		}
		return maxArea;
	}

	private static int largestRectangleArea(int[] heights) {
		if (heights.length == 0) {
			return 0;
		}
		int len = heights.length;
		if (len == 1) {
			return heights[0];
		}
		int maxArea = 0;
		int[] newHeights = new int[len + 2];
		System.arraycopy(heights, 0, newHeights, 1, len);
		len += 2;
		heights = newHeights;
		Deque<Integer> stack = new ArrayDeque<>();
		stack.addLast(0);
		for (int idx = 1; idx < len; idx++) {
			while (heights[stack.peekLast()] > heights[idx]) {
				int height = heights[stack.removeLast()];
				int width = idx - stack.peekLast() - 1;
				maxArea = Math.max(maxArea, width * height);
			}
			stack.addLast(idx);
		}
		return maxArea;
	}
}
