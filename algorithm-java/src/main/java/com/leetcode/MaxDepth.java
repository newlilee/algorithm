package com.leetcode;

import com.leetcode.common.TreeNode;

/**
 * leetcode.104
 * 给定一个二叉树 root ，返回其最大深度。
 * <p>
 * 二叉树的 最大深度 是指从根节点到最远叶子节点的最长路径上的节点数。
 *
 * @author clx
 */
public class MaxDepth {

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight())) + 1;
	}
}
