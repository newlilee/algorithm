package com.leetcode;

import com.leetcode.util.ArrayUtils;

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
	 * @param height height array
	 * @return max contained rain
	 */
	public static int maxRain(int[] height) {
		if (ArrayUtils.checkArrayValid(height)) {
			return 0;
		}
		int len = height.length;
		int maxArea = 0;
		int idx = 0;
		int jdx = len - 1;
		while (idx < jdx) {
			int minHeight = Math.min(height[idx], height[jdx]);
			int area = (jdx - idx) * minHeight;
			maxArea = Math.max(maxArea, area);
			while (height[idx] <= minHeight && idx < jdx) {
				idx++;
			}
			while (height[jdx] <= minHeight && idx < jdx) {
				jdx--;
			}
		}
		return maxArea;
	}
}
