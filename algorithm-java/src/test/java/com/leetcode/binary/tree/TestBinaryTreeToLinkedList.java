package com.leetcode.binary.tree;

import com.leetcode.binary.tree.BinaryTreeToLinkedList;
import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestBinaryTreeToLinkedList {

	@Test
	public void testTransfer() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
		root.setRight(new TreeNode(3).setLeft(new TreeNode(6)).setRight(new TreeNode(7)));
		System.out.println(root);
		TreeNode tn = BinaryTreeToLinkedList.transfer(root);
		System.out.println(tn);
	}
}
