package com.leetcode;

import com.leetcode.common.TreeNode;

import java.util.Objects;

/**
 * 654. build maximum binary tree
 *
 * @author clx
 */
public class MaximumBinaryTree {
	/**
	 * build binary tree
	 *
	 * @param array
	 * @return
	 */
	public static TreeNode buildMaximumBinaryTree(int[] array) {
		if (Objects.isNull(array) || array.length == 0) {
			return null;
		}
		return build(array, 0, array.length - 1);
	}

	/**
	 * build
	 *
	 * @param array
	 * @param lo
	 * @param hi
	 * @return
	 */
	private static TreeNode build(int[] array, int lo, int hi) {
		if (lo > hi) {
			return null;
		}

		int rootIdx = 0;
		int rootVal = Integer.MIN_VALUE;
		for (int idx = lo; idx <= hi; idx++) {
			if (array[idx] > rootVal) {
				rootIdx = idx;
				rootVal = array[idx];
			}
		}

		TreeNode root = new TreeNode(rootVal);
		root.setLeftNode(build(array, lo, rootIdx - 1));
		root.setRightNode(build(array, rootIdx + 1, array.length - 1));
		return root;
	}
}
