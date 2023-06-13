package com.leetcode;

import com.leetcode.common.TreeNode;

/**
 * leetcode 98.
 *
 * @author clx
 */
public class ValidBinarySearchTree {

	private static long preVal = Long.MIN_VALUE;

	/**
	 * inorder
	 *
	 * @param root {@link TreeNode}
	 * @return bool
	 */
	public static boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (!isValidBST(root.getLeft())) {
			return false;
		}
		if (root.getVal() <= preVal) {
			return false;
		}
		preVal = root.getVal();
		return isValidBST(root.getRight());
	}
}
