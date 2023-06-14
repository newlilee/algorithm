package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestReverseLinkedList {

	@Test
	public void testReverseWithRecursive() {
		// case 1
		ListNode caseOne = new ListNode(1);
		caseOne.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println(caseOne);
		System.out.println(ReverseLinkedList.reverseWithRecursive(caseOne));

		// case 2
		ListNode caseTwo = new ListNode(1);
		caseTwo.setNext(2);
		System.out.println(caseTwo);
		System.out.println(ReverseLinkedList.reverseWithRecursive(caseTwo));

		// case 3
		ListNode caseThree = new ListNode();
		System.out.println(caseThree);
		System.out.println(ReverseLinkedList.reverseWithRecursive(caseThree));
	}

	@Test
	public void testReverseWithIteration() {
		// case 1
		ListNode caseOne = new ListNode(1);
		caseOne.setNext(2).setNext(3).setNext(4).setNext(5);
		System.out.println(caseOne);
		System.out.println(ReverseLinkedList.reverseWithIteration(caseOne));

		// case 2
		ListNode caseTwo = new ListNode(1);
		caseTwo.setNext(2);
		System.out.println(caseTwo);
		System.out.println(ReverseLinkedList.reverseWithIteration(caseTwo));

		// case 3
		ListNode caseThree = new ListNode();
		System.out.println(caseThree);
		System.out.println(ReverseLinkedList.reverseWithIteration(caseThree));
	}
}
