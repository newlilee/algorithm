package com.leetcode;

import com.leetcode.common.TreeNode;

import java.util.Objects;

/**
 * 114. transfer binary tree to linked list
 *
 * @author clx
 */
public class BinaryTreeToLinkedList {

	/**
	 * transfer
	 *
	 * @param root
	 * @return
	 */
	public static TreeNode transfer(TreeNode root) {
		if (Objects.isNull(root)) {
			return null;
		}
		transfer(root.getLeftNode());
		transfer(root.getRightNode());

		TreeNode leftNode = root.getLeftNode();
		TreeNode rightNode = root.getRightNode();

		root.setLeftNode(null);
		root.setRightNode(leftNode);

		TreeNode tn = root;
		while (Objects.nonNull(tn.getRightNode())) {
			tn = tn.getRightNode();
		}
		tn.setRightNode(rightNode);
		return root;
	}
}
