package com.leetcode;

import com.leetcode.util.SortUtils;

/**
 * 11. Container With Most Water
 *
 * @author clx
 */
public class ContainerWithMostWater {

	/**
	 * max area brute force
	 *
	 * @param height
	 * @return
	 */
	public static int maxAreaBruteForce(int[] height) {
		if (SortUtils.checkArrayValid(height)) {
			return -1;
		}
		int maxArea = 0;
		for (int idx = 0; idx < height.length; idx++) {
			for (int jdx = idx + 1; jdx < height.length; jdx++) {
				maxArea = Math.max(maxArea, Math.min(height[idx], height[jdx]) * (jdx - idx));
			}
		}
		return maxArea;
	}

	/**
	 * @param height
	 * @return
	 */
	public static int maxArea(int[] height) {
		if (SortUtils.checkArrayValid(height)) {
			return -1;
		}
		int maxArea = 0;
		int left = 0;
		int right = height.length - 1;
		while (left < right) {
			maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}
}
