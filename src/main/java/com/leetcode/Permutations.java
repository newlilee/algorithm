package com.leetcode;

import com.leetcode.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 46. Permutations
 * Given a collection of distinct integers, return all possible permutations.
 *
 * @author clx
 */
public class Permutations {

	/**
	 * @param array
	 * @return
	 */
	public static List<List<Integer>> permutations(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		backtracking(result, new ArrayList<>(), array);
		return result;
	}

	/**
	 * backtracking
	 *
	 * @param result
	 * @param list
	 * @param array
	 */
	private static void backtracking(List<List<Integer>> result, List<Integer> list, int[] array) {
		if (array.length == list.size()) {
			result.add(new ArrayList<>(list));
		} else {
			for (int idx = 0; idx < array.length; idx++) {
				if (list.contains(array[idx])) {
					continue;
				}
				list.add(array[idx]);
				backtracking(result, list, array);
				list.remove(list.size() - 1);
			}
		}
	}
}
