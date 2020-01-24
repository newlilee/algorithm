package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.Test;

/**
 * @author clx
 */
public class TestReverseNodesKGroup {

	@Test
	public void testReverseBruteForce() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println("original:" + head);
		int k = 3;
		ListNode result = ReverseNodesKGroup.reverseBruteForce(head, k);
		System.out.println("swapped:" + result);
	}
}
