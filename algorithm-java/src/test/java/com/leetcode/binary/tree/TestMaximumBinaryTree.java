package com.leetcode.binary.tree;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestMaximumBinaryTree {

	@Test
	public void testBuildMaximumBinaryTree() {
		int[] array = { 3, 2, 1, 6, 0, 5 };
		TreeNode root = MaximumBinaryTree.buildMaximumBinaryTree(array);
		System.out.println(root);
	}
}
