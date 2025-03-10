package com.leetcode.binary.tree;

import com.leetcode.common.TreeNode;

/**
 * restore binary tree
 * </p>
 * 106.从中序与后序遍历序列构造二叉树
 *
 * @author clx
 */
public class RestoreTreeFromInAndPostOrder {

	/**
	 * index of inOrder array
	 */
	private static int inOrderIdx;
	/**
	 * index of postOrder array
	 */
	private static int postOrderIdx;

	/**
	 * restore binary tree use in&post order
	 *
	 * @return
	 */
	public static TreeNode restoreFromMidAndPostOrder(int[] inOrder, int[] postOrder) {
		inOrderIdx = inOrder.length - 1;
		postOrderIdx = postOrder.length - 1;
		return buildTree(inOrder, postOrder, null);
	}

	private static TreeNode buildTree(int[] inOrder, int[] postOrder, TreeNode end) {
		if (postOrderIdx < 0) {
			return null;
		}
		// create root node
		TreeNode root = new TreeNode(postOrder[postOrderIdx--]);
		// if right node exist, create right subtree
		if (inOrder[inOrderIdx] != root.getVal()) {
			root.setRight(buildTree(inOrder, postOrder, root));
		}
		inOrderIdx--;
		// if left node exist, create left subtree
		if ((end == null) || (inOrder[inOrderIdx] != end.getVal())) {
			root.setLeft(buildTree(inOrder, postOrder, end));
		}
		return root;
	}
}
