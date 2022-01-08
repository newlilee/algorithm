package com.leetcode.binary.tree;

import com.leetcode.common.TreeNode;

import java.util.Objects;

/**
 * 124.binary tree maximum path sum
 *
 * @author clx
 */
public class MaximumPathSum {

	private static Integer minVal = Integer.MIN_VALUE;

	public static int maximumPathSum(TreeNode root) {
		if (Objects.isNull(root)) {
			return 0;
		}
		int left = Integer.max(0, maximumPathSum(root.getLeft()));
		int right = Integer.max(0, maximumPathSum(root.getRight()));
		minVal = Integer.max(minVal, left + right + root.getVal());
		return Integer.max(left, right) + root.getVal();
	}
}
