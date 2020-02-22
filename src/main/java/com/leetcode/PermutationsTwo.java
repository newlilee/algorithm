package com.leetcode;

import com.leetcode.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 47. Permutations II
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 *
 * @author clx
 */
public class PermutationsTwo {

	/**
	 * @param array
	 * @return
	 */
	public static List<List<Integer>> permutations(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		backtracking(result, new ArrayList<>(), array, 0);
		return result;
	}

	/**
	 * backtracking
	 *
	 * @param result
	 * @param list
	 * @param array
	 */
	private static void backtracking(List<List<Integer>> result, List<Integer> list, int[] array, int startIdx) {
		if (array.length == list.size()) {
			result.add(new ArrayList<>(list));
		} else {
			for (int idx = 0; idx < array.length; idx++) {
				if (idx == startIdx) {
					continue;
				}
				list.add(array[idx]);
				backtracking(result, list, array, idx + 1);
				list.remove(list.size() - 1);
			}
		}
	}
}
