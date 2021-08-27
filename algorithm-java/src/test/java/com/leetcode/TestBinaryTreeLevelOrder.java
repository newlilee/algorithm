package com.leetcode;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestBinaryTreeLevelOrder {

	@Test
	public void testLevelOrder() {
		TreeNode root = new TreeNode(1);
		root.setLeftNode(new TreeNode(2).setLeftNode(new TreeNode(4)).setRightNode(new TreeNode(5)));
		root.setRightNode(new TreeNode(3).setLeftNode(new TreeNode(6)).setRightNode(new TreeNode(7).setRightNode(new TreeNode(8))));
		System.out.println(root);
		List<List<Integer>> result = BinaryTreeLevelOrder.levelOrderWithQueue(root);
		System.out.println("result:" + result);
	}
}
