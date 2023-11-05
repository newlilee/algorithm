package com.leetcode;

import com.leetcode.common.TreeNode;

/**
 * leetcode.114 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * @author clx
 */
public class FlattenBinaryTree {

	private static TreeNode preNode = null;

	/**
	 * leetcode.114 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
	 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
	 *
	 * @param root rootNode
	 */
	public static void flattenWithPreOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		if (preNode != null) {
			preNode.setLeft(null);
			preNode.setRight(root);
		}
		preNode = root;
		TreeNode temp = root.getRight();
		flattenWithPreOrder(root.getLeft());
		flattenWithPreOrder(temp);
	}

	/**
	 * 展开后的单链表应该同样使用 TreeNode ，其中 left 子指针指向链表中下一个结点，而右子指针始终为 null 。 展开后的单链表应该与二叉树
	 * 后序遍历 顺序相同。
	 *
	 * @param root rootNode
	 */
	public static void flattenWithPosOrder(TreeNode root) {

	}

	/**
	 * 展开后的单链表应该与二叉树 中序遍历 顺序相同。
	 *
	 * @param root rootNode
	 */
	public static void flattenWithInOrder(TreeNode root) {

	}
}
