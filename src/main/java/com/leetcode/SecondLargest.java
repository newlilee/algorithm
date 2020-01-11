package com.leetcode;

import com.leetcode.util.SortUtils;

/**
 * find second largest
 *
 * @author clx 4/13/2019
 */
public class SecondLargest {

	/**
	 * find second largest number
	 *
	 * @param array
	 * @return
	 */
	public static int findSecondLargest(int[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		int max = array[0];
		int secondMax = Integer.MIN_VALUE;
		for (int idx = 1; idx < array.length; idx++) {
			if (array[idx] > max) {
				secondMax = max;
				max = array[idx];
			} else {
				if (array[idx] > secondMax) {
					secondMax = array[idx];
				}
			}
		}
		return secondMax;
	}

	/**
	 * find second max number
	 *
	 * @param array
	 * @return
	 */
	public int findSecondMax(int[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		TreeNode root = new TreeNode(array[0]);
		root.leftNode = new TreeNode(Integer.MIN_VALUE);
		for (int idx = 1; idx < array.length; idx++) {
			if (array[idx] > root.val) {
				root.leftNode.val = root.val;
				root.val = array[idx];
			} else {
				if (array[idx] > root.leftNode.val) {
					root.leftNode.val = array[idx];
				}
			}
		}
		return root.leftNode.val;
	}

	/**
	 * node
	 */
	class TreeNode {
		int val;
		TreeNode leftNode;
		TreeNode rightNode;

		public TreeNode(int val) {
			this.val = val;
		}
	}
}
