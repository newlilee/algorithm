package com.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * leetcode.128
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 * <p>
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 *
 * @author clx
 */
public class LongestConsecutive {

	public static int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		int longestConsecutiveNum = 0;
		for (int num : numSet) {
			if (!numSet.contains(num - 1)) {
				int currNum = num;
				int currConsecutiveNum = 1;
				while (numSet.contains(currNum + 1)) {
					currNum += 1;
					currConsecutiveNum += 1;
				}
				longestConsecutiveNum = Math.max(longestConsecutiveNum, currConsecutiveNum);
			}
		}
		return longestConsecutiveNum;
	}
}
