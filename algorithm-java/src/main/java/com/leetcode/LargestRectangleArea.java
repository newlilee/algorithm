package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 84. 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。
 * <p>
 * 求在该柱状图中，能够勾勒出来的矩形的最大面积。
 *
 * @author clx
 */
public class LargestRectangleArea {

	/**
	 * max rectangle area
	 *
	 * @param heights heights array
	 * @return max area
	 */
	public static int largestRectangleAreaWithDeque(int[] heights) {
		if (heights == null || heights.length == 0) {
			return 0;
		}
		int len = heights.length;
		if (len == 1) {
			return heights[0];
		}
		int[] newHeights = new int[len + 2];
		System.arraycopy(heights, 0, newHeights, 1, len);
		len += 2;
		heights = newHeights;
		int area = 0;
		Deque<Integer> stack = new ArrayDeque<>();
		stack.addLast(0);
		for (int idx = 1; idx < len; idx++) {
			while (heights[stack.peekLast()] > heights[idx]) {
				int height = heights[stack.removeLast()];
				int width = idx - stack.peekLast() - 1;
				area = Math.max(area, width * height);
			}
			stack.addLast(idx);
		}
		return area;
	}
}
