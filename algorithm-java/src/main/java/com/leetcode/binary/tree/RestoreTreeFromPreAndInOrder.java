package com.leetcode.binary.tree;

import com.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * restore binary tree
 * </p>
 * 105.从前序与中序遍历序列构造二叉树
 *
 * @author clx
 */
public class RestoreTreeFromPreAndInOrder {

	private static int preOrderIdx;
	private static Map<Integer, Integer> inOrderIdxMap;

	/**
	 * restore binary tree use pre&mid order
	 *
	 * @return
	 */
	public static TreeNode restoreFromPreAndMidOrder(int[] preorder, int[] inorder) {
		preOrderIdx = 0;
		// build a hashmap to store value -> its index relations
		inOrderIdxMap = new HashMap<>();
		for (int i = 0; i < inorder.length; i++) {
			inOrderIdxMap.put(inorder[i], i);
		}
		return arrayToTree(preorder, 0, preorder.length - 1);
	}

	private static TreeNode arrayToTree(int[] preorder, int left, int right) {
		// if there are no elements to construct the tree
		if (left > right) {
			return null;
		}

		// select the preorder_index element as the root and increment it
		int rootValue = preorder[preOrderIdx++];
		TreeNode root = new TreeNode(rootValue);

		// build left and right subtree
		// excluding inorderIndexMap[rootValue] element because it's the root
		root.setLeft(arrayToTree(preorder, left, inOrderIdxMap.get(rootValue) - 1));
		root.setRight(arrayToTree(preorder, inOrderIdxMap.get(rootValue) + 1, right));
		return root;
	}
}
