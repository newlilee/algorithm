package com.leetcode;

import com.leetcode.util.ArrayUtils;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * leetcode 11
 * 给定一个长度为n的整数数组height。有n条垂线，第i条线的两个端点是(i, 0)和(i, height[i])。
 * <p>
 * 找出其中的两条线，使得它们与x轴共同构成的容器可以容纳最多的水。
 * <p>
 * 返回容器可以储存的最大水量。
 * <p>
 * 说明：你不能倾斜容器。
 *
 * @author clx
 */
public class MaxRain {

	/**
	 * max rain with double pointer
	 *
	 * @param height height array
	 * @return max contained rain
	 */
	public static int maxRainWithDoublePointer(int[] height) {
		if (ArrayUtils.checkArrayValid(height)) {
			return 0;
		}
		int maxArea = 0;
		int idx = 0;
		int jdx = height.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		while (idx < jdx) {
			leftMax = Math.max(leftMax, height[idx]);
			rightMax = Math.max(rightMax, height[jdx]);
			if (leftMax < rightMax) {
				maxArea += leftMax - height[idx];
				idx++;
			} else {
				maxArea += rightMax - height[jdx];
				jdx--;
			}
		}
		return maxArea;
	}

	/**
	 * max rain with deque
	 *
	 * @param height height array
	 * @return max contained rain
	 */
	public static int maxRainWithDeque(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}
		int len = height.length;
		if (len == 1) {
			return 0;
		}

		int maxRain = 0;
		Deque<Integer> stack = new ArrayDeque<>();
		for (int idx = 0; idx < len; idx++) {
			while (!stack.isEmpty() && height[stack.peekLast()] < height[idx]) {
				int bottom = stack.removeLast();
				if (stack.isEmpty()) {
					break;
				}
				int left = stack.peekLast();
				int leftHeight = height[left];
				int rightHeight = height[idx];
				int bottomHeight = height[bottom];
				maxRain += (idx - left - 1) * (Math.min(leftHeight, rightHeight) - bottomHeight);
			}
			stack.addLast(idx);
		}
		return maxRain;
	}
}
