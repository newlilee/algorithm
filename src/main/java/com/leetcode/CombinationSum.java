package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 * Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * <p>
 * The same repeated number may be chosen from candidates unlimited number of times.
 * <p>
 * Note:
 * <p>
 * All numbers (including target) will be positive integers.
 * The solution set must not contain duplicate combinations.
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
		List<List<Integer>> result = new ArrayList<>();
		backtracking(result, array, new ArrayList<>(), target, 0);
		return result;
	}

	private static void backtracking(List<List<Integer>> result, int[] array, List<Integer> list, int remain, int pos) {
		if (remain < 0) {
			return;
		}
		if (remain == 0) {
			result.add(new ArrayList<>(list));
			return;
		}
		for (int idx = pos; idx < array.length && array[idx] <= remain; idx++) {
			list.add(array[idx]);
			backtracking(result, array, list, remain - array[idx], idx);
			list.remove(list.size() - 1);
		}
	}
}
