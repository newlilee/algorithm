package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestBuildBinaryTree {

	@Test
	public void testBuildBinaryTreeFromPreAndInOrder() {
		// case 1
		int[] caseOnePreOrder = {3, 9, 20, 15, 7};
		int[] caseOneInOrder = {9, 3, 15, 20, 7};
		System.out.println(BuildBinaryTree.buildTreeFromPreAndInOrder(caseOnePreOrder, caseOneInOrder));

		// case 2
		int[] caseTwoPreOrder = {-1};
		int[] caseTwoInOrder = {-1};
		System.out.println(BuildBinaryTree.buildTreeFromPreAndInOrder(caseTwoPreOrder, caseTwoInOrder));
	}
}
