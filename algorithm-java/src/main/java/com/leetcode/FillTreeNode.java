package com.leetcode;

import java.util.Objects;

/**
 * 116.填充每个节点的下一个右侧节点指针
 *
 * @author clx
 */
public class FillTreeNode {

	/**
	 * fill every node's next right node pointer
	 *
	 * @param root
	 */
	public static Node fillNextNode(Node root) {
		if (Objects.isNull(root)) {
			return null;
		}
		connectTwoNode(root.leftNode, root.rightNode);
		return root;
	}

	/**
	 * connect
	 *
	 * @param firstNode  node
	 * @param secondNode node
	 */
	private static void connectTwoNode(Node firstNode, Node secondNode) {
		if (Objects.isNull(firstNode) || Objects.isNull(secondNode)) {
			return;
		}
		// point to next node
		firstNode.nextNode = secondNode;
		// point to next node if have same parent node
		connectTwoNode(firstNode.leftNode, firstNode.rightNode);
		connectTwoNode(secondNode.leftNode, secondNode.rightNode);
		// point to next node if haven't same parent node
		connectTwoNode(firstNode.rightNode, secondNode.leftNode);
	}

	/**
	 * Node for connect next node
	 */
	static class Node {
		/**
		 * value
		 */
		Integer val;
		/**
		 * left node
		 */
		Node leftNode;
		/**
		 * right node
		 */
		Node rightNode;
		/**
		 * next node
		 */
		Node nextNode;
	}
}
