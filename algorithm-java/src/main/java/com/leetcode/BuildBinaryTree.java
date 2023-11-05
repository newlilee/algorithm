package com.leetcode;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.leetcode.common.TreeNode;

/**
 * @author clx
 */
public class BuildBinaryTree {

	/**
	 * leetcode.105
	 * 给定两个整数数组preorder和inorder,其中preorder是二叉树的先序遍历,inorder是同一棵树的中序遍历,请构造二叉树并返回其根节点。
	 *
	 * @param preOrder pre
	 * @param inOrder  in
	 * @return tree
	 */
	public static TreeNode buildTreeFromPreAndInOrder(int[] preOrder, int[] inOrder) {
		if (preOrder.length == 0 || inOrder.length == 0) {
			return null;
		}
		Map<Integer, Integer> inOrderMap = IntStream.range(0, inOrder.length).boxed()
				.collect(Collectors.toMap(idx -> inOrder[idx], idx -> idx));
		return buildTreeFromPreAndInOrderHelper(inOrderMap, preOrder, 0, preOrder.length, inOrder, 0, inOrder.length);
	}

	private static TreeNode buildTreeFromPreAndInOrderHelper(Map<Integer, Integer> inOrderMap, int[] preOrder,
			int preStart, int preEnd, int[] inOrder, int inStart, int inEnd) {
		// preOrder 为空
		if (preStart == preEnd) {
			return null;
		}
		// root val
		int rootVal = preOrder[preStart];
		TreeNode root = new TreeNode(rootVal);
		// find root idx in inOrder
		int inRootIdx = inOrderMap.get(rootVal);
		int leftNum = inRootIdx - inStart;
		root.setLeft(buildTreeFromPreAndInOrderHelper(inOrderMap, preOrder, preStart + 1, preStart + leftNum + 1,
				inOrder, inStart, inRootIdx));
		root.setRight(buildTreeFromPreAndInOrderHelper(inOrderMap, preOrder, preStart + leftNum + 1, preEnd, inOrder,
				inRootIdx + 1, inEnd));
		return root;
	}
}
