package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.Test;

/**
 * @author clx 4/21/2019
 */
public class TestLinkedList {

	@Test
	public void testReverseLinkedListByRecursive() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3);
		System.out.println(head);
		ListNode result = LinkedList.reverseLinkedList(head);
		System.out.println(result);
	}

	@Test
	public void testReverseLinkedListByLoop() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println(head);
		ListNode result = LinkedList.reverseList(head);
		System.out.println(result);
	}
}
