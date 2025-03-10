package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestFindDuplicateSubtree {

	@Test
	public void testFindDuplicateSubtree() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
		root.setRight(new TreeNode(3).setLeft(new TreeNode(2).setLeft(new TreeNode(4))).setRight(new TreeNode(4)));
		System.out.println(root);

		List<Integer> result = FindDuplicateSubtree.findDuplicateSubtree(root);
		System.out.println("result:" + result);
	}
}
