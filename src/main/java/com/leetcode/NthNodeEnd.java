package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * 19. Remove Nth Node From End of List
 *
 * @author clx
 */
public class NthNodeEnd {

	/**
	 * @param head
	 * @param n
	 * @return
	 */
	public static ListNode removeNthFromEndBruteForce(ListNode head, int n) {
		ListNode dummyNode = new ListNode(0);
		dummyNode.setNext(head);
		ListNode firstNode = head;
		int len = 0;
		while (firstNode != null) {
			len++;
			firstNode = firstNode.getNext();
		}
		len = len - n;
		firstNode = dummyNode;
		while (len > 0) {
			len--;
			firstNode = firstNode.getNext();
		}
		firstNode.setNext(firstNode.getNext().getNext());
		return dummyNode.getNext();
	}

	/**
	 * @param head
	 * @param n
	 * @return
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {

		return null;
	}
}
