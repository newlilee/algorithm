package com.leetcode;

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
	private static int inorderIdx;
	/**
	 * index of postOrder array
	 */
	private static int postorderIdx;

	/**
	 * restore binary tree use in&post order
	 *
	 * @return
	 */
	public static TreeNode restoreFromMidAndPostOrder(int[] inOrder, int[] postOrder) {
		inorderIdx = inOrder.length - 1;
		postorderIdx = postOrder.length - 1;
		return buildTree(inOrder, postOrder, null);
	}

	private static TreeNode buildTree(int[] inOrder, int[] postOrder, TreeNode end) {
		if (postorderIdx < 0) {
			return null;
		}
		// create root node
		TreeNode root = new TreeNode(postOrder[postorderIdx--]);
		// if right node exist, create right subtree
		if (inOrder[inorderIdx] != root.getVal()) {
			root.setRight(buildTree(inOrder, postOrder, root));
		}
		inorderIdx--;
		// if left node exist, create left subtree
		if ((end == null) || (inOrder[inorderIdx] != end.getVal())) {
			root.setLeft(buildTree(inOrder, postOrder, end));
		}
		return root;
	}
}
