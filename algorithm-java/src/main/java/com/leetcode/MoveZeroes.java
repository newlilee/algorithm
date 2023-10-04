package com.leetcode;

/**
 * leetcode.283
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * <p>
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 *
 * @author clx
 */
public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0) {
			return;
		}
		int len = nums.length;
		if (len == 1) {
			return;
		}
		int slow = 0;
		int fast = 0;
		while (fast < len) {
			if (nums[fast] != 0) {
				nums[slow] = nums[fast];
				if (slow++ != fast) {
					nums[fast] = 0;
				}
			}
			fast++;
		}
	}
}
