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
		ListNode newHead = head.getNext();
		head.setNext(swapByRecursive(head.getNext().getNext()));
		newHead.setNext(head);
		return newHead;
	}

	/**
	 * swap node pair
	 *
	 * @param head
	 * @return
	 */
	public static ListNode swapNodeByLoop(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.setNext(head);
		ListNode preNode = dummy;
		int idx = 0;
		while (head != null) {
			idx++;
			if (idx % 2 == 0) {
				preNode = reverse(preNode, head.getNext());
				head = preNode.getNext();
			} else {
				head = head.getNext();
			}
		}
		return dummy.getNext();
	}

	/**
	 * reverse
	 *
	 * @param preNode
	 * @param next
	 * @return
	 */
	private static ListNode reverse(ListNode preNode, ListNode next) {
		ListNode tailNode = preNode.getNext();
		ListNode curr = tailNode.getNext();
		while (curr != next) {
			tailNode.setNext(curr.getNext());
			curr.setNext(preNode.getNext());
			preNode.setNext(curr);
			curr = tailNode.getNext();
		}
		return tailNode;
	}
}
