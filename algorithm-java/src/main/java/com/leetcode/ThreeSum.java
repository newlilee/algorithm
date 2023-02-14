package com.leetcode;

import com.leetcode.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum
 * 给你一个整数数组nums，判断是否存在三元组[nums[i],nums[j],nums[k]] 满足i!= j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请
 * <p>
 * 你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 *
 * @author clx
 */
public class ThreeSum {

	/**
	 * @param nums array
	 * @return three sum pair
	 */
	public static List<List<Integer>> threeSum(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new ArrayList<>();
		}

		int len = nums.length;
		// 排序避免重复
		Arrays.sort(nums);
		List<List<Integer>> sumResult = new ArrayList<>();
		for (int idx = 0; idx < len; idx++) {
			if (idx > 0 && nums[idx] == nums[idx - 1]) {
				continue;
			}
			int kdx = len - 1;
			int target = -nums[idx];
			for (int jdx = idx + 1; jdx < len; jdx++) {
				if (jdx > idx + 1 && nums[jdx] == nums[jdx - 1]) {
					continue;
				}
				while (jdx < kdx && nums[jdx] + nums[kdx] > target) {
					kdx--;
				}
				if (jdx == kdx) {
					break;
				}
				if (nums[jdx] + nums[kdx] == target) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[idx]);
					list.add(nums[jdx]);
					list.add(nums[kdx]);
					sumResult.add(list);
				}
			}
		}
		return sumResult;
	}
}
