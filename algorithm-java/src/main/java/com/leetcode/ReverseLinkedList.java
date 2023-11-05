package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * leetcode.206 给你单链表的头节点 head,请你反转链表，并返回反转后的链表。
 *
 * @author clx
 */
public class ReverseLinkedList {

	/**
	 * reverse linkedList with recursive
	 *
	 * @param head {@link ListNode}
	 * @return {@link ListNode}
	 */
	public static ListNode reverseWithRecursive(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode reverseHead = reverseWithRecursive(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return reverseHead;
	}

	/**
	 * reverse linkedList with loop
	 *
	 * @param head {@link ListNode}
	 * @return {@link ListNode}
	 */
	public static ListNode reverseWithIteration(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode preNode = null;
		ListNode currNode = head;
		ListNode nextNode;
		while (currNode != null) {
			nextNode = currNode.getNext();
			currNode.setNext(preNode);
			preNode = currNode;
			currNode = nextNode;
		}
		return preNode;
	}
}
