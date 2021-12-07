package com.leetcode.binary.tree;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMaximumPathSum {

	@Test
	public void testMaximumPathSum() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
		root.setRight(new TreeNode(3).setLeft(new TreeNode(6)).setRight(new TreeNode(7).setRight(new TreeNode(8))));
		System.out.println(root);
		int result = MaximumPathSum.maximumPathSum(root);
		System.out.println("result" + result);
	}
}
