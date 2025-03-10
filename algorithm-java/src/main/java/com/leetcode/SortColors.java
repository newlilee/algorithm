package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 75.
 *
 * @author clx
 */
public class SortColors {

	/**
	 * sort
	 *
	 * @param nums array
	 */
	public static void sortColors(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return;
		}
		int num0 = 0;
		int num1 = 0;
		int num2 = 0;
		for (int idx = 0; idx < nums.length; idx++) {
			if (nums[idx] == 0) {
				nums[num2++] = 2;
				nums[num1++] = 1;
				nums[num0++] = 0;
			} else if (nums[idx] == 1) {
				nums[num2++] = 2;
				nums[num1++] = 1;
			} else {
				nums[num2++] = 2;
			}
		}
	}

	/**
	 * sort
	 *
	 * @param nums array
	 */
	public static void sortColorsWithDoublePointer(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return;
		}
		int p1 = 0;
		int p2 = nums.length - 1;
		for (int idx = 0; idx <= p2; idx++) {
			while (idx <= p2 && nums[idx] == 2) {
				int temp = nums[p2];
				nums[p2] = nums[idx];
				nums[idx] = temp;
				p2--;
			}
			if (nums[idx] == 0) {
				int temp = nums[p1];
				nums[p1] = nums[idx];
				nums[idx] = temp;
				p1++;
			}
		}
	}
}
