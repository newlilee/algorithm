package com.leetcode;

/**
 * leetcode.27 Remove Element
 *
 * @author clx
 */
public class RemoveElement {

	/**
	 * remove element brute force
	 *
	 * @param nums array
	 * @param val  target val
	 * @return new array len
	 */
	public static int removeElementBruteForce(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return -1;
		}
		int count = 0;
		for (int num : nums) {
			if (val != num) {
				count++;
			}
		}
		return count;
	}


}
