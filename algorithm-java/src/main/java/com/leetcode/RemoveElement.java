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

	/**
	 * remove element use two point
	 *
	 * @param nums array
	 * @param val  target val
	 * @return new array len
	 */
	public static int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int len = nums.length;
		int slow = 0;
		int fast = 0;
		while (fast < len) {
			if (nums[fast] != val) {
				nums[slow] = nums[fast];
				if (slow++ != fast) {
					nums[fast] = val;
				}
			}
			fast++;
		}
		return slow;
	}
}
