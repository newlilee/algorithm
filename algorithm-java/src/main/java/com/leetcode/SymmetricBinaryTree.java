package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.common.TreeNode;

/**
 * leetcode. 101 给你一个二叉树的根节点root,检查它是否轴对称。
 *
 * @author clx
 */
public class SymmetricBinaryTree {

	/**
	 * symmetric binary tree
	 *
	 * @param root {@link TreeNode}
	 * @return bool
	 */
	public static boolean isSymmetricWithRecursive(TreeNode root) {
		if (root == null) {
			return true;
		}
		return symmetricWithRecursive(root.getLeft(), root.getRight());
	}

	private static boolean symmetricWithRecursive(TreeNode nodeOne, TreeNode nodeTwo) {
		if (nodeOne == null && nodeTwo == null) {
			return true;
		}
		if (nodeOne == null || nodeTwo == null || !nodeOne.getVal().equals(nodeTwo.getVal())) {
			return false;
		}
		return symmetricWithRecursive(nodeOne.getLeft(), nodeTwo.getRight())
				&& symmetricWithRecursive(nodeOne.getRight(), nodeTwo.getLeft());
	}

	public static boolean isSymmetricWithIteration(TreeNode root) {
		if (root == null) {
			return true;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root.getLeft());
		queue.offer(root.getRight());
		while (!queue.isEmpty()) {
			TreeNode nodeOne = queue.poll();
			TreeNode nodeTwo = queue.poll();
			if (nodeOne == null && nodeTwo == null) {
				continue;
			}
			if (nodeOne == null || nodeTwo == null || !nodeOne.getVal().equals(nodeTwo.getVal())) {
				return false;
			}
			queue.offer(nodeOne.getLeft());
			queue.offer(nodeTwo.getRight());
			queue.offer(nodeOne.getRight());
			queue.offer(nodeTwo.getLeft());
		}
		return true;
	}
}
