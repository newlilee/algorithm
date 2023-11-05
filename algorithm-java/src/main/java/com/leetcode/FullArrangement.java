package com.leetcode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.leetcode.util.ArrayUtils;

/**
 * 43. 给定一个不含重复数字的数组nums，返回其所有可能的全排列。你可以按任意顺序返回答案。
 *
 * @author clx
 */
public class FullArrangement {

	/**
	 * full arrangement
	 *
	 * @param nums array
	 * @return result
	 */
	public static List<List<Integer>> arrangement(int[] nums) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new LinkedList<>();
		backtrack(result, nums, new LinkedList<>());
		return result;
	}

	private static void backtrack(List<List<Integer>> result, int[] nums, LinkedList<Integer> track) {
		if (nums.length == track.size()) {
			result.add(new LinkedList<>(track));
			return;
		}

		for (int num : nums) {
			if (track.contains(num)) {
				continue;
			}
			track.add(num);
			backtrack(result, nums, track);
			track.removeLast();
		}
	}
}
