package com.leetcode;

import com.leetcode.common.TreeNode;

import java.util.Objects;

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
		TreeNode tmp = root.getLeftNode();
		root.setLeftNode(root.getRightNode());
		root.setRightNode(tmp);

		invertTree(root.getLeftNode());
		invertTree(root.getRightNode());

		return root;
	}
}
