package com.leetcode.binary.tree;

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
		transfer(root.getLeft());
		transfer(root.getRight());

		TreeNode leftNode = root.getLeft();
		TreeNode rightNode = root.getRight();
		// 将左子树节点放到右子树
		root.setLeft(null);
		root.setRight(leftNode);
		// 将右子树放到root的右子树下
		TreeNode tn = root;
		while (Objects.nonNull(tn.getRight())) {
			tn = tn.getRight();
		}
		tn.setRight(rightNode);
		return root;
	}
}
