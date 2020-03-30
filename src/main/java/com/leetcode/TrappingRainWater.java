package com.leetcode;

import com.leetcode.util.ArrayUtils;

import java.util.Stack;

/**
 * 42. Trapping Rain Water
 *
 * @author clx
 */
public class TrappingRainWater {

	/**
	 * @param height
	 * @return
	 */
	public static int trapBruteForce(int[] height) {
		if (ArrayUtils.checkArrayValid(height)) {
			return 0;
		}

		int result = 0;
		int len = height.length;
		for (int idx = 1; idx < len - 1; idx++) {
			int maxLeft = 0;
			int maxRight = 0;
			for (int jdx = idx; jdx >= 0; jdx--) {
				maxLeft = Math.max(maxLeft, height[jdx]);
			}
			for (int jdx = idx; jdx < len; jdx++) {
				maxRight = Math.max(maxRight, height[jdx]);
			}
			result += Math.min(maxLeft, maxRight) - height[idx];
		}
		return result;
	}

	/**
	 * @param height
	 * @return
	 */
	public static int trapWithDoublePointer(int[] height) {
		if (ArrayUtils.checkArrayValid(height)) {
			return 0;
		}
		int leftIdx = 0;
		int rightIdx = height.length - 1;
		int leftMax = 0;
		int rightMax = 0;
		int result = 0;
		while (leftIdx < rightIdx) {
			if (height[leftIdx] > leftMax) {
				leftMax = height[leftIdx];
			}
			if (height[rightIdx] > rightMax) {
				rightMax = height[rightIdx];
			}
			if (leftMax < rightMax) {
				result += leftMax - height[leftIdx];
				leftIdx++;
			} else {
				result += rightMax - height[rightIdx];
				rightIdx--;
			}
		}
		return result;
	}

	/**
	 * @param height
	 * @return
	 */
	public static int trapStack(int[] height) {
		if (ArrayUtils.checkArrayValid(height)) {
			return 0;
		}
		int result = 0;
		int current = 0;
		Stack<Integer> stack = new Stack<>();
		while (current < height.length) {
			while (!stack.empty() && height[current] > height[stack.peek()]) {
				int top = stack.peek();
				stack.pop();
				if (stack.empty()) {
					break;
				}
				int distance = current - stack.peek() - 1;
				int boundedHeight = Math.min(height[current], height[stack.peek()]) - height[top];
				result += distance * boundedHeight;
			}
			stack.push(current++);
		}
		return result;
	}

	/**
	 * @param height
	 * @return
	 */
	public static int trapDynamicPrograming(int[] height) {
		if (ArrayUtils.checkArrayValid(height)) {
			return 0;
		}
		int result = 0;
		int len = height.length;
		int[] leftMax = new int[len];
		int[] rightMax = new int[len];
		leftMax[0] = height[0];
		for (int idx = 1; idx < len; idx++) {
			leftMax[idx] = Math.max(height[idx], leftMax[idx - 1]);
		}
		rightMax[len - 1] = height[len - 1];
		for (int idx = len - 2; idx >= 0; idx--) {
			rightMax[idx] = Math.max(height[idx], rightMax[idx + 1]);
		}
		for (int idx = 1; idx < len - 1; idx++) {
			result += Math.min(leftMax[idx], rightMax[idx]) - height[idx];
		}
		return result;
	}
}
