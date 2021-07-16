package com.leetcode;

import com.leetcode.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestFindDuplicateSubtree {

	@Test
	public void testFindDuplicateSubtree() {
		TreeNode root = new TreeNode(1);
		root.setLeftNode(new TreeNode(2).setLeftNode(new TreeNode(4)).setRightNode(new TreeNode(5)));
		root.setRightNode(new TreeNode(3).setLeftNode(new TreeNode(2).setLeftNode(new TreeNode(4))).setRightNode(new TreeNode(4)));
		System.out.println(root);

		List<Integer> result = FindDuplicateSubtree.findDuplicateSubtree(root);
		System.out.println("result:" + result);
	}
}
