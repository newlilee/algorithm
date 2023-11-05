package com.leetcode;

/**
 * 167. Two Sum II - Input array is sorted
 *
 * @author clx
 */
public class TwoSumTwo {

	/**
	 * @param array  num array
	 * @param target target val
	 * @return sum of target idx
	 */
	public static int[] twoSum(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int sum = array[left] + array[right];
			if (sum == target) {
				return new int[] { left + 1, right + 1 };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}
		return new int[] { -1, -1 };
	}
}
