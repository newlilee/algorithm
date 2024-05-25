package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.ListNode;

/**
 * @author clx
 */
public class TestReverseNodesKGroup {

	@Test
	public void testReverseRecursive() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5).setNext(6).setNext(7);
		System.out.println("original:" + head);
		int k = 3;
		ListNode result = ReverseNodesKGroup.reverseByRecursive(head, k);
		System.out.println("swapped:" + result);
	}

	@Test
	public void testReverseLoop() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5).setNext(6).setNext(7);
		System.out.println("original:" + head);
		int k = 3;
		ListNode result = ReverseNodesKGroup.reverseByLoop(head, k);
		System.out.println("swapped:" + result);
	}
}
