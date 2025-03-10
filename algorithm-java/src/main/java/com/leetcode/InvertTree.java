package com.leetcode;

import java.util.Objects;

import com.leetcode.common.TreeNode;

/**
 * 226. invert tree
 *
 * @author clx
 */
public class InvertTree {

	/**
	 * invert tree
	 *
	 * @param root
	 */
	public static TreeNode invertTree(TreeNode root) {
		if (Objects.isNull(root)) {
			return null;
		}
		// invert left & right node
		TreeNode tmp = root.getLeft();
		root.setLeft(root.getRight());
		root.setRight(tmp);
		// invert left & right child tree
		invertTree(root.getLeft());
		invertTree(root.getRight());
		return root;
	}
}
