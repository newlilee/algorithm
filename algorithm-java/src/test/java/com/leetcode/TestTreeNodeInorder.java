package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestTreeNodeInorder {

	@Test
	public void testInorderWithIteration() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(3))).setRight(new TreeNode(4).setLeft(new TreeNode(5)));
		System.out.println(TreeNodeInorder.inorderWithIteration(root));
	}

	@Test
	public void testInorderWithRecursion() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(3))).setRight(new TreeNode(4).setLeft(new TreeNode(5)));
		System.out.println(TreeNodeInorder.inorderWithRecursion(root));
	}
}
