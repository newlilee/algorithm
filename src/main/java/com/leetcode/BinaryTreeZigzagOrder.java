package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * binary tree zigzag order traversing
 * 
 * @author clx 4/13/2019
 */
public class BinaryTreeZigzagOrder {

	/**
	 * zigzag order traversing using dfs
	 * 
	 * @return
	 */
	public List<List<Integer>> zigzagOrderTraversingUsingDFS(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<List<Integer>> resultList = new ArrayList<>();
		this.zigzagDFS(root, resultList, 0);
		return resultList;
	}

	public List<List<Integer>> zigzagOrderTraversingUsingBFS(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<List<Integer>> resultList = new ArrayList<>();
		this.zigzagBFS(root, resultList);
		return resultList;
	}

	/**
	 * traversing using dfs
	 * 
	 * @param currNode
	 * @param retList
	 * @param level
	 */
	private void zigzagDFS(TreeNode currNode, List<List<Integer>> resultList, int level) {
		if (level <= resultList.size()) {
			List<Integer> subList = new LinkedList<>();
			resultList.add(subList);
		}
		List<Integer> subList = resultList.get(level);
		if (level % 2 == 0) {
			subList.add(currNode.val);
		} else {
			subList.add(0, currNode.val);
		}
		this.zigzagDFS(currNode.left, resultList, level + 1);
		this.zigzagDFS(currNode.right, resultList, level + 1);
	}

	/**
	 * traversing using bfs
	 */
	private void zigzagBFS(TreeNode root, List<List<Integer>> resulList) {
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		boolean canReverse = false;
		while (!queue.isEmpty()) {
			LinkedList<Integer> subList = new LinkedList<>();
			for (int idx = 0; idx < queue.size(); idx++) {
				TreeNode currNode = queue.poll();
				if (canReverse) {
					subList.addFirst(currNode.val);
				} else {
					subList.add(currNode.val);
				}
				if (currNode.left != null) {
					queue.offer(currNode.left);
				}
				if (currNode.right != null) {
					queue.offer(currNode.right);
				}
			}
			resulList.add(subList);
			canReverse = !canReverse;
		}
	}

	/**
	 * tree node
	 */
	private class TreeNode {
		Integer val;
		TreeNode left;
		TreeNode right;

		public TreeNode(Integer val) {
			this.val = val;
		}
	}
}
