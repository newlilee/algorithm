package com.leetcode;

/**
 * leetcode 96. 给你一个整数 n ，求恰由 n 个节点组成且节点值从 1 到 n 互不相同的 二叉搜索树
 * 有多少种？返回满足题意的二叉搜索树的种数。
 *
 * @author clx
 */
public class BinarySearchTree {

	/**
	 * num of binary search tree
	 *
	 * @param n integer
	 * @return num of tree
	 */
	public static int numTrees(int n) {
		int[] arr = new int[n + 1];
		arr[0] = 1;
		arr[1] = 1;
		for (int idx = 2; idx <= n; idx++) {
			for (int jdx = 1; jdx <= idx; jdx++) {
				arr[idx] += arr[jdx - 1] * arr[idx - jdx];
			}
		}
		return arr[n];
	}
}
