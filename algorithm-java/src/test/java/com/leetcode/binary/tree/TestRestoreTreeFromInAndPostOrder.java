package com.leetcode.binary.tree;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestRestoreTreeFromInAndPostOrder {

	@Test
	public void TestRestoreFromMidAndLastOrder() {
		int[] inOrder = { 9, 3, 15, 20, 7 };
		int[] postOrder = { 9, 15, 7, 20, 3 };
		TreeNode root = RestoreTreeFromInAndPostOrder.restoreFromMidAndPostOrder(inOrder, postOrder);
		System.out.println("result:" + root);
	}
}
