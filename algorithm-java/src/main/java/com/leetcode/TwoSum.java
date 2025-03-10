package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.leetcode.util.ArrayUtils;

/**
 * leetcode 1 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target
 * 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 *
 * @author clx 2019/05/15
 */
public class TwoSum {

	/**
	 * add two num brute force
	 *
	 * @param nums   array
	 * @param target 目标值
	 * @return 数组下标
	 */
	public static int[] addTwoSum(int[] nums, int target) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new int[] {};
		}
		for (int idx = 0; idx < nums.length; idx++) {
			for (int jdx = 1; jdx < nums.length; jdx++) {
				if (target - nums[idx] == nums[jdx]) {
					return new int[] { idx, jdx };
				}
			}
		}
		return new int[] {};
	}

	/**
	 * add two num with two round hash
	 *
	 * @param nums   array
	 * @param target 目标值
	 * @return 数组下标
	 */
	public static int[] twoSumWithHash(int[] nums, int target) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new int[] {};
		}
		// Map<element, idx>
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int idx = 0; idx < nums.length; idx++) {
			numsMap.put(nums[idx], idx);
		}
		for (int idx = 0; idx < nums.length; idx++) {
			int val = target - nums[idx];
			if (numsMap.get(val) != null && idx != numsMap.get(val)) {
				return new int[] { idx, numsMap.get(val) };
			}
		}
		return new int[] {};
	}

	/**
	 * add two num with one pass hash
	 *
	 * @param nums   array
	 * @param target 目标值
	 * @return 数组下标
	 */
	public static int[] twoSumOnePassHash(int[] nums, int target) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new int[] {};
		}
		// Map<element, idx>
		Map<Integer, Integer> numsMap = new HashMap<>();
		for (int idx = 0; idx < nums.length; idx++) {
			int val = target - nums[idx];
			if (numsMap.get(val) != null && numsMap.get(val) != idx) {
				return new int[] { idx, numsMap.get(val) };
			}
			numsMap.put(nums[idx], idx);
		}
		return new int[] {};
	}

	/**
	 * all two sum pair
	 *
	 * @param nums   array
	 * @param target 目标值
	 * @return 数组下标
	 */
	public static List<List<Integer>> twoSum(int[] nums, int target) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new ArrayList<>();
		}
		List<List<Integer>> sumResult = new ArrayList<>();
		Map<Integer, Integer> numsMap = new HashMap<>(nums.length);
		for (int idx = 0; idx < nums.length; idx++) {
			int key = target - nums[idx];
			Integer result = numsMap.get(key);
			if (Objects.nonNull(result) && result != idx) {
				sumResult.add(Arrays.asList(result, idx));
			}
			numsMap.put(nums[idx], idx);
		}
		return sumResult;
	}
}
