package com.leetcode;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestSymmetricBinaryTree {

	@Test
	public void testSymmetricBinaryTreeWithRecursive() {
		// case 1
		TreeNode caseOne = new TreeNode(1);
		caseOne.setLeft(new TreeNode(2).setLeft(new TreeNode(3)).setRight(new TreeNode(4))).setRight(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(3)));
		System.out.println(SymmetricBinaryTree.isSymmetricWithRecursive(caseOne));

		// case 2
		TreeNode caseTwo = new TreeNode(1);
		caseTwo.setLeft(new TreeNode(2).setRight(new TreeNode(3))).setRight(new TreeNode(2).setRight(new TreeNode(3)));
		System.out.println(SymmetricBinaryTree.isSymmetricWithRecursive(caseTwo));
	}

	@Test
	public void testSymmetricBinaryTreeWithIteration() {
		// case 1
		TreeNode caseOne = new TreeNode(1);
		caseOne.setLeft(new TreeNode(2).setLeft(new TreeNode(3)).setRight(new TreeNode(4))).setRight(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(3)));
		System.out.println(SymmetricBinaryTree.isSymmetricWithIteration(caseOne));

		// case 2
		TreeNode caseTwo = new TreeNode(1);
		caseTwo.setLeft(new TreeNode(2).setRight(new TreeNode(3))).setRight(new TreeNode(2).setRight(new TreeNode(3)));
		System.out.println(SymmetricBinaryTree.isSymmetricWithIteration(caseTwo));
	}
}
