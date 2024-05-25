package com.leetcode;

import org.testng.annotations.Test;

import com.leetcode.common.ListNode;

/**
 * @author clx
 */
public class TestPalindromeListNode {

	@Test
	public void testPalindrome() {
		// case 1
		ListNode caseOne = new ListNode().initListNode(new int[] { 1, 2, 2, 1 });
		System.out.println(PalindromeListNode.isPalindrome(caseOne));

		// case 2
		ListNode caseTwo = new ListNode().initListNode(new int[] { 1, 2 });
		System.out.println(PalindromeListNode.isPalindrome(caseTwo));
	}

	@Test
	public void testPalindromeListNode() {
		// case 1
		ListNode caseOne = new ListNode().initListNode(new int[] { 1, 2, 2, 1 });
		System.out.println(PalindromeListNode.isPalindromeListNode(caseOne));

		// case 2
		ListNode caseTwo = new ListNode().initListNode(new int[] { 1, 2 });
		System.out.println(PalindromeListNode.isPalindromeListNode(caseTwo));
	}
}
