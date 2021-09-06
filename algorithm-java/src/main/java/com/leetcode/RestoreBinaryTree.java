package com.leetcode;

import com.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * restore binary tree
 * </p>
 * 105.从前序与中序遍历序列构造二叉树
 * </p>
 * 106.从中序与后序遍历序列构造二叉树
 *
 * @author clx
 */
public class RestoreBinaryTree {

	static int preorderIndex;
	static Map<Integer, Integer> inorderIndexMap;

	/**
	 * restore binary tree use pre&mid order
	 *
	 * @return
	 */
	public static TreeNode restoreFromPreAndMidOrder(int[] preorder, int[] inorder) {
		preorderIndex = 0;
		// build a hashmap to store value -> its index relations
		inorderIndexMap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			inorderIndexMap.put(inorder[i], i);
		}
		return arrayToTree(preorder, 0, preorder.length - 1);
	}

	/**
	 * restore binary tree use mid&last order
	 *
	 * @return
	 */
	public static TreeNode restoreFromMidAndLastOrder() {
		return null;
	}

	private static TreeNode arrayToTree(int[] preorder, int left, int right) {
		// if there are no elements to construct the tree
		if (left > right) {
			return null;
		}

		// select the preorder_index element as the root and increment it
		int rootValue = preorder[preorderIndex++];
		TreeNode root = new TreeNode(rootValue);

		// build left and right subtree
		// excluding inorderIndexMap[rootValue] element because it's the root
		root.setLeftNode(arrayToTree(preorder, left, inorderIndexMap.get(rootValue) - 1));
		root.setRightNode(arrayToTree(preorder, inorderIndexMap.get(rootValue) + 1, right));
		return root;
	}
}
