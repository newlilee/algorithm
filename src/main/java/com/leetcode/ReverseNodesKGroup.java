package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * 25. Reverse Nodes in k-Group
 *
 * @author clx
 */
public class ReverseNodesKGroup {

	/**
	 * reverse k group brute force
	 *
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode reverseBruteForce(ListNode head, int k) {
		if (head == null || head.getNext() == null || k <= 0) {
			return head;
		}

		return null;
	}
}
