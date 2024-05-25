package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TestFlattenBinaryTree {

	@Test
	public void testFlatten() {
		// case 1
		TreeNode caseOne = new TreeNode(1);
		caseOne.setLeft(new TreeNode(2).setLeft(new TreeNode(3)).setRight(new TreeNode(4)))
				.setRight(new TreeNode(5).setRight(new TreeNode(6)));
		System.out.println("before:" + caseOne);
		FlattenBinaryTree.flattenWithPreOrder(caseOne);
		System.out.println("after:" + caseOne);

		// case 2
		TreeNode caseTwo = new TreeNode();
		System.out.println("before:" + caseTwo);
		FlattenBinaryTree.flattenWithPreOrder(caseTwo);
		System.out.println("after:" + caseTwo);

		// case 3
		TreeNode caseThree = new TreeNode(0);
		System.out.println("before:" + caseThree);
		FlattenBinaryTree.flattenWithPreOrder(caseThree);
		System.out.println("after:" + caseThree);
	}
}
