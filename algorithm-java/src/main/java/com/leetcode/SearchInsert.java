package com.leetcode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * nums 为无重复元素的升序 排列数组
 * <p>
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * 
 * @author clx
 */
public class SearchInsert {

	public static int searchInsert(int[] nums, int target) {
		if (nums == null) {
			return -1;
		}
		if (nums.length == 0) {
			return 0;
		}
		int targetIdx = 0;
		for (int idx = 0; idx < nums.length; idx++) {
			if (nums[idx] >= target) {
				targetIdx = idx;
				break;
			}
		}
		if (targetIdx == 0 && target > nums[nums.length - 1]) {
			return nums.length;
		}
		return targetIdx;
	}
}
