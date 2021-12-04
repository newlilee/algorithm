package com.leetcode;

import com.leetcode.binary.tree.BinaryTreeLevelOrder;
import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

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
