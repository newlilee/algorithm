package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * 24. Swap Nodes in Pairs
 *
 * @author clx
 */
public class SwapNodePair {

	/**
	 * swap node pair brute force use recursive
	 *
	 * @param head
	 * @return
	 */
	public static ListNode swapByRecursive(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode currNode = head.getNext();
		head.setNext(swapByRecursive(head.getNext().getNext()));
		currNode.setNext(head);
		return currNode;
	}

	/**
	 * swap node pair use loop
	 *
	 * @param head
	 * @return
	 */
	public static ListNode swapByLoop(ListNode head) {

		return null;
	}
}
