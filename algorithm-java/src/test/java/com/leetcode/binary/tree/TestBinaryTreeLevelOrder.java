package com.leetcode.binary.tree;

import java.util.List;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestBinaryTreeLevelOrder {

	@Test
	public void testLevelOrder() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
		root.setRight(new TreeNode(3).setLeft(new TreeNode(6)).setRight(new TreeNode(7).setRight(new TreeNode(8))));
		System.out.println(root);
		List<List<Integer>> result = BinaryTreeLevelOrder.levelOrderWithQueue(root);
		System.out.println("result:" + result);
	}

	@Test
	public void testLevelTraversalWithBfs() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
		root.setRight(new TreeNode(3).setLeft(new TreeNode(6)).setRight(new TreeNode(7).setRight(new TreeNode(8))));
		System.out.println(root);
		List<List<Integer>> result = BinaryTreeLevelOrder.levelOrderWithBFS(root);
		System.out.println("result:" + result);
	}
}
