package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.leetcode.util.ArrayUtils;

/**
 * 39. Combination Sum 给你一个无重复元素 的整数数组candidates
 * 和一个目标整数target，找出candidates中可以使数字和为目标数target的 所有不同组合，并以列表形式返回。你可以按任意顺序返回这些组合。
 * <p>
 * candidates 中的同一个数字可以无限制重复被选取。如果至少一个数字的被选数量不同，则两种组合是不同的。
 * <p>
 * 对于给定的输入，保证和为target的不同组合数少于 150 个。
 *
 * @author clx
 */
public class CombinationSum {

	/**
	 * @param candidates array
	 * @param target     sum
	 * @return {@link List<List<Integer>>}
	 */
	public static List<List<Integer>> combine(int[] candidates, int target) {
		if (ArrayUtils.checkArrayValid(candidates)) {
			return new ArrayList<>();
		}
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<>();
		backtracking(result, candidates, new ArrayList<>(), target, 0);
		return result;
	}

	private static void backtracking(List<List<Integer>> result, int[] array, List<Integer> subList, int remain,
			int nextIdx) {
		if (remain < 0) {
			return;
		}
		if (remain == 0) {
			result.add(new ArrayList<>(subList));
			return;
		}
		for (int idx = nextIdx; idx < array.length && array[idx] <= remain; idx++) {
			subList.add(array[idx]);
			backtracking(result, array, subList, remain - array[idx], idx);
			subList.remove(subList.size() - 1);
		}
	}
}
