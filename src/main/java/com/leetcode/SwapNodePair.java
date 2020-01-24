package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * 24. Swap Nodes in Pairs
 *
 * @author clx
 */
public class SwapNodePair {

	/**
	 * swap node pair brute force
	 *
	 * @param head
	 * @return
	 */
	public static ListNode swapBruteForce(ListNode head) {
		if (head == null) {
			return null;
		}
		if (head.getNext() == null) {
			return head;
		}
		ListNode currNode = head.getNext();
		head.setNext(swapBruteForce(head.getNext().getNext()));
		currNode.setNext(head);
		return currNode;
	}
}
