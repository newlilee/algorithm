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
}
