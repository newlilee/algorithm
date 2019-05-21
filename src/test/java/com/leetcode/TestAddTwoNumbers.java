package com.leetcode;

import org.junit.Test;

import com.leetcode.common.ListNode;

/**
 * @author clx 2019-05-18
 */
public class TestAddTwoNumbers {

	@Test
	public void testAddTwoNum() {
		// init data
		ListNode first = new ListNode(2);
		ListNode firstNext = new ListNode(4);
		first.setNext(firstNext);
		firstNext.setNext(new ListNode(3));
		ListNode second = new ListNode(5);
		ListNode secondNext = new ListNode(6);
		second.setNext(secondNext);
		secondNext.setNext(new ListNode(4));

		ListNode listNode = new AddTwoNumbers().addTwoNum(first, second);
		while (listNode != null) {
			System.out.println(listNode.getVal());
			listNode = listNode.getNext();
		}
	}
}
