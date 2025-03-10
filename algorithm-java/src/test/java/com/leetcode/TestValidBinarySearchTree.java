package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestValidBinarySearchTree {

	@Test
	public void test() {
		// case 1
		TreeNode caseOne = new TreeNode(2);
		caseOne.setLeft(new TreeNode(1)).setRight(new TreeNode(3));
		System.out.println(ValidBinarySearchTree.isValidBST(caseOne));

		// case 2
		TreeNode caseTwo = new TreeNode(0);
		System.out.println(ValidBinarySearchTree.isValidBST(caseTwo));
	}
}
