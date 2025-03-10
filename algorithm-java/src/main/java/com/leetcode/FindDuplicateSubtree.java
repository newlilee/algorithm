package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.leetcode.common.TreeNode;

/**
 * 652. find duplicate subtree
 *
 * @author clx
 */
public class FindDuplicateSubtree {

	private static Map<String, Integer> duplicateMap = new HashMap<>();
	private static List<Integer> duplicateNode = new ArrayList<>();

	/**
	 * find duplicate subtree
	 *
	 * @param root root
	 * @return
	 */
	public static List<Integer> findDuplicateSubtree(TreeNode root) {
		findDuplicate(root);
		return duplicateNode;
	}

	private static String findDuplicate(TreeNode root) {
		if (root == null) {
			return "*";
		}

		String left = findDuplicate(root.getLeft());
		String right = findDuplicate(root.getRight());

		String subtreeString = left + ',' + right + ',' + root.getVal();
		int duplicateCount = duplicateMap.getOrDefault(subtreeString, 0);
		if (duplicateCount == 1) {
			duplicateNode.add(root.getVal());
		}
		duplicateMap.put(subtreeString, duplicateCount + 1);
		return subtreeString;
	}
}
