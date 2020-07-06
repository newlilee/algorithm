package com.leetcode;

import com.leetcode.util.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 40. Combination Sum II
 * Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.
 * <p>
 * Each number in candidates may only be used once in the combination.
 *
 * @author clx
 */
public class CombinationSumTwo {

	/**
	 * @param array
	 * @param target
	 * @return
	 */
	public static List<List<Integer>> combination(int[] array, int target) {
		if (ArrayUtils.checkArrayValid(array)) {
			return Collections.emptyList();
		}
		Arrays.sort(array);
		List<List<Integer>> result = new ArrayList<>();
		backtracking(result, array, new ArrayList<>(), target, 0);
		return result;
	}

	private static void backtracking(List<List<Integer>> result, int[] array, List<Integer> list, int remain, int startIdx) {
		if (remain < 0) {
			return;
		} else if (remain == 0) {
			result.add(new ArrayList<>(list));
		} else {
			for (int idx = startIdx; idx < array.length; idx++) {
				if (idx > startIdx && array[idx] == array[idx - 1]) {
					continue;
				}
				list.add(array[idx]);
				backtracking(result, array, list, remain - array[idx], idx + 1);
				list.remove(list.size() - 1);
			}
		}
	}
}
