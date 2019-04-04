package com.algorithm.chapterthree.search.first;

import java.util.*;

/**
 * binary tree traversing
 * 
 * @author clx 4/2/2018
 */
public class BinaryTreeTraversing {

	private static List<Comparable> retList = new ArrayList<>();

	/**
	 * recursive preOrder traversing
	 * 
	 * @param root
	 */
	public static void preOrderTraversingRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		retList.add(root.value);
		preOrderTraversingRecursive(root.leftNode);
		preOrderTraversingRecursive(root.rightNode);
	}

	/**
	 * recursive inOrder traversing
	 * 
	 * @param root
	 */
	public static void inOrderTraversingRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrderTraversingRecursive(root.leftNode);
		retList.add(root.value);
		inOrderTraversingRecursive(root.rightNode);
	}

	/**
	 * recursive postOrder traversing
	 * 
	 * @param root
	 */

	public static void postOrderTraversingRecursive(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrderTraversingRecursive(root.leftNode);
		postOrderTraversingRecursive(root.rightNode);
		retList.add(root.value);
	}

	/**
	 * iterator preOrder traversing
	 * 
	 * @param root
	 */
	public static void preOrderTraversingIter(TreeNode root) {
		Stack<TreeNode> treeNodeStack = new Stack<>();
		TreeNode treeNode = root;
		while (treeNode != null || !treeNodeStack.isEmpty()) {
			while (treeNode != null) {
				retList.add(treeNode.value);
				treeNodeStack.push(treeNode);
				treeNode = treeNode.leftNode;
			}
			if (!treeNodeStack.isEmpty()) {
				treeNode = treeNodeStack.pop();
				treeNode = treeNode.rightNode;
			}
		}
	}

	/**
	 * iterator inOrder traversing
	 * 
	 * @param root
	 */
	public static void inOrderTraversingIter(TreeNode root) {
		Stack<TreeNode> treeNodeStack = new Stack<>();
		TreeNode treeNode = root;
		while (treeNode != null || !treeNodeStack.isEmpty()) {
			while (treeNode != null) {
				treeNodeStack.push(treeNode);
				treeNode = treeNode.leftNode;
			}
			if (!treeNodeStack.isEmpty()) {
				treeNode = treeNodeStack.pop();
				retList.add(treeNode.value);
				treeNode = treeNode.rightNode;
			}
		}
	}

	/**
	 * iterator postOrder traversing
	 * 
	 * @param root
	 */
	public static void postOrderTraversingIter(TreeNode root) {
		Stack<TreeNode> treeNodeStack = new Stack<>();
		TreeNode treeNode = root;
		TreeNode lastVisit = root;
		while (treeNode != null || !treeNodeStack.isEmpty()) {
			while (treeNode != null) {
				treeNodeStack.push(treeNode);
				treeNode = treeNode.leftNode;
			}
			treeNode = treeNodeStack.peek();
			if (treeNode.rightNode == null || treeNode.rightNode == lastVisit) {
				retList.add(treeNode.value);
				treeNodeStack.pop();
				lastVisit = treeNode;
				treeNode = null;
			} else {
				treeNode = treeNode.rightNode;
			}
		}
	}

	/**
	 * level order traversing
	 * 
	 * @param root
	 */
	public static List<List<Integer>> levelOrderTraversing(TreeNode root) {
		if (root == null) {
			return Collections.emptyList();
		}
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> nodeList = new ArrayList<>(levelSize);
			for (int idx = 0; idx < levelSize; idx++) {
				if (queue.peek().leftNode != null) {
					queue.offer(queue.peek().leftNode);
				}
				if (queue.peek().rightNode != null) {
					queue.offer(queue.peek().rightNode);
				}
				nodeList.add(queue.poll().value);
			}
			result.add(nodeList);
		}
		return result;
	}

	private class TreeNode {
		/**
		 * tree node value
		 */
		private Integer value;
		/**
		 * left node
		 */
		private TreeNode leftNode;
		/**
		 * right node
		 */
		private TreeNode rightNode;

		public TreeNode(Integer value) {
			this.value = value;
		}
	}
}
