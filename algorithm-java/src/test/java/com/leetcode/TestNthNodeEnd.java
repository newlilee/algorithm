package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestNthNodeEnd {

	@Test
	void testBruteForce() {
		// case 1
		Integer[] caseOne = {1, 2, 3, 4, 5};
		ListNode headOne = new ListNode().initListNode(caseOne);
		System.out.println(NthNodeEnd.removeNthFromEndBruteForce(headOne, 2));
		// case 2
		Integer[] caseTwo = {1};
		ListNode headTwo = new ListNode().initListNode(caseTwo);
		System.out.println(NthNodeEnd.removeNthFromEndBruteForce(headTwo, 1));
		// case 3
		Integer[] caseThree = {1, 2};
		ListNode headThree = new ListNode().initListNode(caseThree);
		System.out.println(NthNodeEnd.removeNthFromEndBruteForce(headThree, 1));
	}

	@Test
	public void test() {
		// case 1
		Integer[] caseOne = {1, 2, 3, 4, 5};
		ListNode headOne = new ListNode().initListNode(caseOne);
		System.out.println(NthNodeEnd.removeNthFromEnd(headOne, 2));
		// case 2
		Integer[] caseTwo = {1};
		ListNode headTwo = new ListNode().initListNode(caseTwo);
		System.out.println(NthNodeEnd.removeNthFromEnd(headTwo, 1));
		// case 3
		Integer[] caseThree = {1, 2};
		ListNode headThree = new ListNode().initListNode(caseThree);
		System.out.println(NthNodeEnd.removeNthFromEnd(headThree, 1));
	}
}
