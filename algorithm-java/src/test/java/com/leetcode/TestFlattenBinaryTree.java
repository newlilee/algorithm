package com.leetcode;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestFlattenBinaryTree {

	@Test
	public void testFlatten() {
		// case 1
		TreeNode caseOne = new TreeNode(1);
		caseOne.setLeft(new TreeNode(2).setLeft(new TreeNode(3)).setRight(new TreeNode(4))).setRight(new TreeNode(5).setRight(new TreeNode(6)));
		System.out.println("before:" + caseOne);
		FlattenBinaryTree.flatten(caseOne);
		System.out.println("after:" + caseOne);

		// case 2
		TreeNode caseTwo = new TreeNode();
		System.out.println("before:" + caseTwo);
		FlattenBinaryTree.flatten(caseTwo);
		System.out.println("after:" + caseTwo);

		// case 3
		TreeNode caseThree = new TreeNode(0);
		System.out.println("before:" + caseThree);
		FlattenBinaryTree.flatten(caseThree);
		System.out.println("after:" + caseThree);
	}
}
