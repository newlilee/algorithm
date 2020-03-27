package com.leetcode;

import com.leetcode.util.ArrayUtils;

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
}
