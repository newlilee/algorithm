package com.leetcode;

import com.leetcode.common.ListNode;
import com.leetcode.linkedlist.LinkedList;
import org.junit.jupiter.api.Test;

/**
 * @author clx 4/21/2019
 */
public class TestLinkedList {

	@Test
	public void testReverseLinkedListByRecursive() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println(head);
		ListNode result = LinkedList.reverseRecursive(head);
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

	@Test
	public void testReverseLinkedList() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println(head);
		ListNode result = LinkedList.reverseLinkedList(head);
		System.out.println(result);
	}

	@Test
	public void testHasCycle() {
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(6);
		head.setNext(2).setNext(3).setNext(4).setNext(5).setNext(tail);
		ListNode pointNode = head.getNext().getNext().getNext();
		tail.setNext(pointNode);
		boolean result = LinkedList.hasCycle(head);
		System.out.println("result:" + result);
	}

	@Test
	public void testDetectCycle() {
		ListNode head = new ListNode(1);
		ListNode tail = new ListNode(6);
		head.setNext(2).setNext(3).setNext(4).setNext(5).setNext(tail);
		ListNode pointNode = head.getNext().getNext().getNext();
		tail.setNext(pointNode);
		ListNode result = LinkedList.detectCycle(head);
		System.out.println("result:" + result);
	}

	@Test
	public void testFindKNode() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println(head);
		ListNode result = LinkedList.findKNode(head, 3);
		System.out.println("result:" + result);
	}
}
