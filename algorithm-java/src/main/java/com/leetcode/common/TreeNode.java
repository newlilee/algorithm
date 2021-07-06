package com.leetcode.common;

/**
 * Binary Tree Node
 *
 * @author clx
 */
public class TreeNode {

	/**
	 * current node value
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

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public TreeNode getLeftNode() {
		return leftNode;
	}

	public TreeNode setLeftNode(TreeNode leftNode) {
		this.leftNode = leftNode;
		return this;
	}

	public TreeNode getRightNode() {
		return rightNode;
	}

	public TreeNode setRightNode(TreeNode rightNode) {
		this.rightNode = rightNode;
		return this;
	}

	@Override
	public String toString() {
		return "TreeNode{" +
				"value=" + value +
				", leftNode=" + leftNode +
				", rightNode=" + rightNode +
				'}';
	}
}
