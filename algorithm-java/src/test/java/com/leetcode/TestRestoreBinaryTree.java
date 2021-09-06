package com.leetcode;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestRestoreBinaryTree {

	@Test
	public void TestRestoreFromPreAndMidOrder() {
		int[] preOrder = {3, 9, 20, 15, 7};
		int[] inOrder = {9, 3, 15, 20, 7};
		TreeNode root = RestoreBinaryTree.restoreFromPreAndMidOrder(preOrder, inOrder);
		System.out.println("result:" + root);
	}

	@Test
	public void TestRestoreFromMidAndLastOrder() {

	}
}
