package com.leetcode;

import com.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;

/**
 * leetcode 94.
 * inorder TreeNode
 *
 * @author clx
 */
public class TreeNodeInorder {

	/**
	 * inorder with iteration
	 *
	 * @param root TreeNode root
	 * @return inorder result
	 */
	public static List<Integer> inorderWithIteration(TreeNode root) {
		if (Objects.isNull(root)) {
			return new ArrayList<>();
		}
		List<Integer> result = new ArrayList<>();
		Deque<TreeNode> stack = new ArrayDeque<>();
		while (Objects.nonNull(root) || !stack.isEmpty()) {
			while (Objects.nonNull(root)) {
				stack.addLast(root);
				root = root.getLeft();
			}
			root = stack.removeLast();
			result.add(root.getVal());
			root = root.getRight();
		}
		return result;
	}

	/**
	 * inorder with recursion
	 *
	 * @param root TreeNode root
	 * @return inorder result
	 */
	public static List<Integer> inorderWithRecursion(TreeNode root) {
		if (Objects.isNull(root)) {
			return new ArrayList<>();
		}
		List<Integer> result = new ArrayList<>();
		inorderRecursion(root, result);
		return result;
	}

	private static void inorderRecursion(TreeNode root, List<Integer> result) {
		if (Objects.isNull(root)) {
			return;
		}
		inorderRecursion(root.getLeft(), result);
		result.add(root.getVal());
		inorderRecursion(root.getRight(), result);
	}
}
