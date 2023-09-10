package com.leetcode;

import com.leetcode.common.ListNode;

import java.util.Objects;

/**
 * leetcode.19. Remove Nth Node From End of List
 *
 * @author clx
 */
public class NthNodeEnd {

	/**
	 * @param head head
	 * @param n    n
	 * @return {@link ListNode}
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
		return Objects.isNull(dummyNode.getNext()) ? new ListNode() : dummyNode.getNext();
	}

	/**
	 * two pointer
	 *
	 * @param head head
	 * @param n    n
	 * @return {@link ListNode}
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyNode = new ListNode(0);
		dummyNode.setNext(head);
		ListNode fast = dummyNode;
		for (int idx = 0; idx < n; idx++) {
			fast = fast.getNext();
		}
		ListNode slow = dummyNode;
		while (fast.getNext() != null) {
			fast = fast.getNext();
			slow = slow.getNext();
		}
		slow.setNext(slow.getNext().getNext());
		return Objects.isNull(dummyNode.getNext()) ? new ListNode() : dummyNode.getNext();
	}
}
