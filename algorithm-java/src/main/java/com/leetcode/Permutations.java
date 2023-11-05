package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.leetcode.util.ArrayUtils;

/**
 * 46. Permutations Given a collection of distinct integers, return all possible
 * permutations.
 *
 * @author clx
 */
public class Permutations {

	/**
	 * @param nums array
	 * @return collection result
	 */
	public static List<List<Integer>> permutations(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		backtracking(result, new ArrayList<>(), nums);
		return result;
	}

	private static void backtracking(List<List<Integer>> result, List<Integer> list, int[] nums) {
		if (nums.length == list.size()) {
			result.add(new ArrayList<>(list));
		} else {
			for (int num : nums) {
				if (list.contains(num)) {
					continue;
				}
				list.add(num);
				backtracking(result, list, nums);
				list.remove(list.size() - 1);
			}
		}
	}
}
