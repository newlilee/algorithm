package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.ListNode;

/**
 * @author clx
 */
public class TestMergeTwoSortedList {

	@Test
	void testBruteForce() {
		// case 1
		int[] caseOneA1 = { 1, 2, 4 };
		int[] caseOneA2 = { 1, 3, 4 };
		System.out.println(MergeTwoSortedList.mergeBruteForce(new ListNode().initListNode(caseOneA1),
				new ListNode().initListNode(caseOneA2)));
		// case 2
		int[] caseTwoA1 = new int[] {};
		int[] caseTwoA2 = new int[] {};
		System.out.println(MergeTwoSortedList.mergeBruteForce(new ListNode(), new ListNode()));
		// case 3
		int[] caseThreeA1 = new int[] {};
		int[] caseThreeA2 = { 0 };
		System.out
				.println(MergeTwoSortedList.mergeBruteForce(new ListNode(), new ListNode().initListNode(caseThreeA2)));
	}

	@Test
	void testPriorityQueue() {
		ListNode first = new ListNode(1);
		first.setNext(2).setNext(4);
		ListNode second = new ListNode(1);
		second.setNext(3).setNext(5).setNext(7);

		ListNode result = MergeTwoSortedList.mergeByPriorityQueue(first, second);
		System.out.println(result);
	}
}
