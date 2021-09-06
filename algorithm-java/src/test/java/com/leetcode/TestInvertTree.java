package com.leetcode;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestInvertTree {

	@Test
	public void testInvertTree() {
		TreeNode root = new TreeNode(1);
		root.setLeft(new TreeNode(2).setLeft(new TreeNode(4)).setRight(new TreeNode(5)));
		root.setRight(new TreeNode(3).setLeft(new TreeNode(6)).setRight(new TreeNode(7)));
		System.out.println(root);
		TreeNode invertedTree = InvertTree.invertTree(root);
		System.out.println(invertedTree);
	}
}
