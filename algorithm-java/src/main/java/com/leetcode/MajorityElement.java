package com.leetcode;

/**
 * leetcode.169 给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 * @author clx
 */
public class MajorityElement {

	public static int majorityElement(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		int elementCount = 0;
		Integer majorityElement = null;
		for (int num : nums) {
			if (elementCount == 0) {
				majorityElement = num;
			}
			elementCount += (majorityElement == num) ? 1 : -1;
		}
		return majorityElement;
	}
}
