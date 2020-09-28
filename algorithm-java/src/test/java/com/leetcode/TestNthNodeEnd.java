package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestNthNodeEnd {

	@Test
	public void testBruteForce() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		ListNode result = NthNodeEnd.removeNthFromEndBruteForce(head, 2);
		System.out.println(result);
	}

	@Test
	public void test() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		ListNode result = NthNodeEnd.removeNthFromEnd(head, 2);
		System.out.println(result);
	}
}
