package com.leetcode;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class TreeNodeOperate {

	/**
	 * count tree node
	 *
	 * @param root root
	 * @return sum node
	 */
	public static int countNode(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + countNode(root.getLeftNode()) + countNode(root.getRightNode());
	}
}
