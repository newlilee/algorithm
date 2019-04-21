package com.leetcode;

import org.junit.Test;

/**
 * @author clx 4/21/2019
 */
public class TestLinkedList {

	@Test
	public void testReverseLinkedList() {
		LinkedList.Node head = new LinkedList().new Node(1);
		LinkedList.Node sec = new LinkedList().new Node(2);
		LinkedList.Node third = new LinkedList().new Node(3);
		head.next = sec;
		sec.next = third;
		third.next = null;
		System.out.println(head);
		LinkedList.reverseLinkedList(head);
		System.out.println(third);
	}

	@Test
	public void testReverseList() {
		LinkedList.Node head = new LinkedList().new Node(1);
		LinkedList.Node sec = new LinkedList().new Node(2);
		LinkedList.Node third = new LinkedList().new Node(3);
		head.next = sec;
		sec.next = third;
		third.next = null;
		System.out.println(head);
		LinkedList.reverseList(head);
		System.out.println(third);
	}
}
