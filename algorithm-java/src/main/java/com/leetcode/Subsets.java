package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 78. Subsets Given a set of distinct integers, nums, return all possible
 * subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 *
 * @author clx
 */
public class Subsets {

	/**
	 * @param nums
	 * @return
	 */
	public static List<List<Integer>> subset(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		backtracking(result, new ArrayList<>(), nums, 0);
		return result;
	}

	/**
	 * backtracking
	 *
	 * @param result
	 * @param list
	 * @param array
	 * @param start
	 */
	private static void backtracking(List<List<Integer>> result, List<Integer> list, int[] array, int start) {
		result.add(new ArrayList<>(list));
		for (int idx = start; idx < array.length; idx++) {
			list.add(array[idx]);
			backtracking(result, list, array, idx + 1);
			list.remove(list.size() - 1);
		}
	}
}
