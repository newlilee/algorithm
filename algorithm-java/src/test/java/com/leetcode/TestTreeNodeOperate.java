package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestTreeNodeOperate {

	@Test
	public void testCountNode() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
		root.setRight(new TreeNode(3).setLeft(new TreeNode(6)).setRight(new TreeNode(7)));
		System.out.println(root);

		int countResult = TreeNodeOperate.countNode(root);
		System.out.println("result:" + countResult);
	}
}
