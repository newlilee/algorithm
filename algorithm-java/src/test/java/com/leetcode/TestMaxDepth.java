package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestMaxDepth {

	@Test
	public void testMaxDepth() {
		// case 1
		TreeNode caseOne = new TreeNode(1);
		caseOne.setLeft(new TreeNode(2).setLeft(new TreeNode(3)).setRight(new TreeNode(4)))
				.setRight(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(3)));
		System.out.println(MaxDepth.maxDepth(caseOne));
	}
}
