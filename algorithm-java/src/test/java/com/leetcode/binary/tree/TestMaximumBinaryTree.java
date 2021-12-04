package com.leetcode;

import com.leetcode.binary.tree.MaximumBinaryTree;
import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMaximumBinaryTree {

	@Test
	public void testBuildMaximumBinaryTree() {
		int[] array = {3, 2, 1, 6, 0, 5};
		TreeNode root = MaximumBinaryTree.buildMaximumBinaryTree(array);
		System.out.println(root);
	}
}
