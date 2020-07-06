package com.leetcode;

import com.leetcode.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).
 * <p>
 * Note: The solution set must not contain duplicate subsets.
 *
 * @author clx
 */
public class SubsetsTwo {

	/**
	 * @param array
	 * @return
	 */
	public static List<List<Integer>> subset(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(array);
		backtracking(result, new ArrayList<>(), array, 0);
		return result;
	}

	/**
	 * backtracking
	 *
	 * @param result
	 * @param list
	 * @param array
	 * @param startIdx
	 */
	private static void backtracking(List<List<Integer>> result, List<Integer> list, int[] array, int startIdx) {
		result.add(new ArrayList<>(list));
		for (int idx = startIdx; idx < array.length; idx++) {
			if (idx > startIdx && array[idx] == array[idx - 1]) {
				continue;
			}
			list.add(array[idx]);
			backtracking(result, list, array, idx + 1);
			list.remove(list.size() - 1);
		}
	}
}
