package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx 2019-05-18
 */
public class TestAddTwoNumbers {

	@Test
	void testAddTwoNum() {
		// case 1
		ListNode caseOneFirst = new ListNode(2);
		ListNode firstNext = new ListNode(4);
		caseOneFirst.setNext(firstNext);
		firstNext.setNext(new ListNode(3));
		ListNode caseOneSecond = new ListNode(5);
		ListNode secondNext = new ListNode(6);
		caseOneSecond.setNext(secondNext);
		secondNext.setNext(new ListNode(4));
		ListNode listNode = AddTwoNumbers.addTwoNum(caseOneFirst, caseOneSecond);
		System.out.println(listNode.toString());

		// case 2
		System.out.println(AddTwoNumbers.addTwoNum(new ListNode(0), new ListNode(0)).toString());

		// case 3
		ListNode caseThreeFirst = new ListNode(9);
		caseThreeFirst.setNext(new ListNode(9).setNext(new ListNode(9).setNext(new ListNode(9))));
		System.out.println(caseThreeFirst.toString());
		ListNode caseThreeSecond = new ListNode(9);
		caseThreeSecond.setNext(new ListNode(9).setNext(new ListNode(9)));
		System.out.println(caseThreeSecond.toString());
		System.out.println(AddTwoNumbers.addTwoNum(caseThreeFirst, caseThreeSecond));
	}
}
