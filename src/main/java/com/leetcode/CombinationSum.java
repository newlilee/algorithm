package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 *
 * @author clx
 */
public class CombinationSum {

	/**
	 * @param array
	 * @param target
	 * @return
	 */
	public static List<List<Integer>> combine(int[] array, int target) {
		Arrays.sort(array);
		List<List<Integer>> res = new ArrayList<>();
		backtrack(res, array, new ArrayList<>(), target, 0);
		return res;
	}

	private static void backtrack(List<List<Integer>> res, int[] nums, List<Integer> temp, int remain, int pos) {
		if (remain < 0) {
			return;
		}
		if (remain == 0) {
			res.add(new ArrayList<>(temp));
			return;
		}
		for (int i = pos; i < nums.length && nums[i] <= remain; i++) {
			temp.add(nums[i]);
			backtrack(res, nums, temp, remain - nums[i], i);
			temp.remove(temp.size() - 1);
		}
	}
}
