package com.leetcode;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
	 * @return
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
				levelList.add(node.getValue());
				if (node.getLeftNode() != null) {
					queue.offer(node.getLeftNode());
				}
				if (node.getRightNode() != null) {
					queue.offer(node.getRightNode());
				}
			}
			traversalResult.add(levelList);
		}
		return traversalResult;
	}

	/**
	 * traversal binary tree with bfs
	 *
	 * @param root
	 * @return
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
		traversalResult.get(depth).add(root.getValue());
		levelTraversal(traversalResult, root.getLeftNode(), depth + 1);
		levelTraversal(traversalResult, root.getRightNode(), depth + 1);
	}
}