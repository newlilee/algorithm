package com.leetcode.binarytree;

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

		// 查找最大值和索引
		int rootIdx = -1;
		int maxVal = Integer.MIN_VALUE;
		for (int idx = lo; idx <= hi; idx++) {
			if (array[idx] > maxVal) {
				rootIdx = idx;
				maxVal = array[idx];
			}
		}

		TreeNode root = new TreeNode(maxVal);
		root.setLeft(build(array, lo, rootIdx - 1));
		root.setRight(build(array, rootIdx + 1, hi));
		return root;
	}
}
