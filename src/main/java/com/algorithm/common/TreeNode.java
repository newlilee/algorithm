package com.algorithm.common;

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
	private TreeNode RightNode;

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
		return RightNode;
	}

	public TreeNode setRightNode(TreeNode rightNode) {
		RightNode = rightNode;
		return this;
	}
}
