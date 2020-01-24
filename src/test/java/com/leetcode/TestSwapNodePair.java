package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.Test;

/**
 * @author clx
 */
public class TestSwapNodePair {

	@Test
	public void testSwapBruteForce() {
		ListNode head = new ListNode(1);
		head.setNext(2).setNext(3).setNext(4);
		System.out.println("original:" + head);
		ListNode result = SwapNodePair.swapBruteForce(head);
		System.out.println("swapped:" + result);
	}
}
