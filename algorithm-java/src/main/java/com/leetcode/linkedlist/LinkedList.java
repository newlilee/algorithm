package com.leetcode.linkedlist;

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
	 * @param head list head node
	 */
	public static ListNode reverseRecursive(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode reverseHead = reverseRecursive(head.getNext());
		head.getNext().setNext(head);
		head.setNext(null);
		return reverseHead;
	}

	/**
	 * reverse linked list use loop
	 *
	 * @param head list head node
	 * @return {@link ListNode}
	 */
	public static ListNode reverseList(ListNode head) {
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

	/**
	 * reverse linked list with non-recursive
	 *
	 * @param head list head node
	 * @return {@link ListNode}
	 */
	public static ListNode reverseLinkedList(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.setNext(head);
		ListNode currNode = head.getNext();
		while (currNode != null) {
			head.setNext(currNode.getNext());
			currNode.setNext(dummy.getNext());
			dummy.setNext(currNode);
			currNode = head.getNext();
		}
		return dummy.getNext();
	}

	/**
	 * leetcode.141 check listNode cycle
	 *
	 * @param head list head node
	 * @return bool
	 */
	public static boolean hasCycle(ListNode head) {
		ListNode fast;
		ListNode slow;
		fast = slow = head;
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	/**
	 * detect cycle ListNode
	 *
	 * @param head list head node
	 * @return {@link ListNode}
	 */
	public static ListNode detectCycle(ListNode head) {
		ListNode fast;
		ListNode slow;
		fast = slow = head;
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
			if (fast == slow) {
				break;
			}
		}
		slow = head;
		while (fast != slow) {
			fast = fast.getNext();
			slow = slow.getNext();
		}
		return slow;
	}

	/**
	 * find k node from tail
	 *
	 * @param head list head node
	 * @param k    k
	 * @return {@link ListNode}
	 */
	public static ListNode findKNode(ListNode head, int k) {
		ListNode slow;
		ListNode fast;
		slow = fast = head;
		while (k-- > 0) {
			fast = fast.getNext();
		}

		while (fast != null) {
			fast = fast.getNext();
			slow = slow.getNext();
		}
		return slow;
	}
}
