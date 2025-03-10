package com.leetcode.binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.leetcode.common.TreeNode;

/**
 * 102. binary tree level order traversal
 *
 * @author clx
 */
public class BinaryTreeLevelOrder {

	/**
	 * level order
	 *
	 * @param root root of tree
	 * @return {@link List<List<Integer>>}
	 */
	public static List<List<Integer>> levelOrderWithQueue(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		List<List<Integer>> traversalResult = new ArrayList<>();
		Queue<TreeNode> queue = new java.util.LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> levelList = new java.util.LinkedList<>();
			int levelNum = queue.size();
			for (int i = 0; i < levelNum; i++) {
				TreeNode node = queue.poll();
				levelList.add(node.getVal());
				if (node.getLeft() != null) {
					queue.offer(node.getLeft());
				}
				if (node.getRight() != null) {
					queue.offer(node.getRight());
				}
			}
			traversalResult.add(levelList);
		}
		return traversalResult;
	}

	/**
	 * traversal binary tree with bfs
	 *
	 * @param root root of tree
	 * @return {@link List<List<Integer>>}
	 */
	public static List<List<Integer>> levelOrderWithBFS(TreeNode root) {
		if (root == null) {
			return new ArrayList<>();
		}
		List<List<Integer>> traversalResult = new ArrayList<>();
		levelTraversal(traversalResult, root, 0);
		return traversalResult;
	}

	private static void levelTraversal(List<List<Integer>> traversalResult, TreeNode root, int depth) {
		if (root == null) {
			return;
		}
		if (depth == traversalResult.size()) {
			traversalResult.add(new LinkedList<>());
		}
		traversalResult.get(depth).add(root.getVal());
		levelTraversal(traversalResult, root.getLeft(), depth + 1);
		levelTraversal(traversalResult, root.getRight(), depth + 1);
	}
}