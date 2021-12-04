package com.leetcode.binary.tree;

import com.leetcode.binary.tree.RestoreTreeFromPreAndInOrder;
import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestRestoreTreeFromPreAndInOrder {

	@Test
	public void TestRestoreFromPreAndMidOrder() {
		int[] preOrder = {3, 9, 20, 15, 7};
		int[] inOrder = {9, 3, 15, 20, 7};
		TreeNode root = RestoreTreeFromPreAndInOrder.restoreFromPreAndMidOrder(preOrder, inOrder);
		System.out.println("result:" + root);
	}
}
