package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * linked list
 *
 * @author clx 4/21/2019
 */
public class LinkedList {

	/**
	 * reverse linked list use recursive
	 *
	 * @param head
	 */
	public static ListNode reverseLinkedList(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode reverseHead = reverseLinkedList(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return reverseHead;
	}

	/**
	 * reverse linked list use loop
	 *
	 * @param head
	 * @return
	 */
	public static ListNode reverseList(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode preNode = null;
		ListNode nextNode = null;
		while (head != null) {
			nextNode = head.getNext();
			head.setNext(preNode);
			preNode = head;
			head = nextNode;
		}
		return preNode;
	}
}
