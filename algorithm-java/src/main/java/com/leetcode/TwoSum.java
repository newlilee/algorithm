package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode 1
 *
 * @author clx 2019/05/15
 */
public class TwoSum {

	/**
	 * add two num brute force
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public int[] addTwoSum(int[] array, int target) {
		if (array == null || array.length == 0) {
			return new int[]{-1};
		}
		for (int idx = 0; idx < array.length; idx++) {
			for (int jdx = idx + 1; jdx < array.length; jdx++) {
				if (array[jdx] == target - array[idx]) {
					return new int[]{idx, jdx};
				}
			}
		}
		throw new IllegalArgumentException("no two number");
	}

	/**
	 * add two num with two round hash
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public int[] twoSumWithHash(int[] array, int target) {
		if (array == null || array.length == 0) {
			return new int[-1];
		}
		Map<Integer, Integer> numMap = new HashMap<>(array.length);
		for (int idx = 0; idx < array.length; idx++) {
			numMap.put(array[idx], idx);
		}
		for (int idx = 0; idx < array.length; idx++) {
			int key = target - array[idx];
			Integer result = numMap.get(key);
			if (result != null && result != idx) {
				return new int[]{idx, result};
			}
		}
		throw new IllegalArgumentException("no two number");
	}

	/**
	 * add two num with one pass hash
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public int[] twoSumOnePassHash(int[] array, int target) {
		if (array == null || array.length == 0) {
			return new int[]{-1};
		}
		Map<Integer, Integer> numMap = new HashMap<>(array.length);
		for (int idx = 0; idx < array.length; idx++) {
			int key = target - array[idx];
			Integer result = numMap.get(key);
			if (result != null && result != idx) {
				return new int[]{idx, result};
			}
			numMap.put(array[idx], idx);
		}
		throw new IllegalArgumentException("no two number");
	}
}
