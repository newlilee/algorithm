package com.leetcode.common;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestListNode {

	@Test
	public void testListNode() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println(head);
	}
}
