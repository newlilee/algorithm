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
	private Integer val;

	/**
	 * left node
	 */
	private TreeNode left;

	/**
	 * right node
	 */
	private TreeNode right;

	public TreeNode() {

	}

	public TreeNode(Integer val) {
		this.val = val;
	}

	public TreeNode(Integer val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public TreeNode setLeft(TreeNode left) {
		this.left = left;
		return this;
	}

	public TreeNode getRight() {
		return right;
	}

	public TreeNode setRight(TreeNode right) {
		this.right = right;
		return this;
	}

	@Override
	public String toString() {
		return "TreeNode{" +
				"value=" + val +
				", left=" + left +
				", right=" + right +
				'}';
	}
}
