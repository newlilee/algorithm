package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * leetcode.234 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 *
 * @author clx
 */
public class PalindromeListNode {

	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.getNext() == null) {
			return true;
		}
		// 1.find mid node
		ListNode midNode = findMidNode(head);
		// 2.reverse last half of ListNode
		ListNode midNodeHead = midNode.getNext();
		ListNode lastHalfHead = reverseListNode(midNodeHead);
		// 3.compare
		return compareListNode(head, lastHalfHead);
	}

	private static ListNode findMidNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast.getNext() != null && fast.getNext().getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		return slow;
	}

	private static ListNode reverseListNode(ListNode head) {
		if (head == null || head.getNext() == null) {
			return head;
		}
		ListNode preNode = null;
		ListNode currNode = head;
		ListNode nextNode;
		while (currNode != null) {
			nextNode = currNode.getNext();
			currNode.setNext(preNode);
			preNode = currNode;
			currNode = nextNode;
		}
		return preNode;
	}

	private static boolean compareListNode(ListNode firstHead, ListNode secondHead) {
		if (firstHead == null || secondHead == null) {
			return false;
		}
		ListNode l1 = firstHead;
		ListNode l2 = secondHead;
		while (l2 != null) {
			if (l1.getVal() != l2.getVal()) {
				return false;
			}
			l1 = l1.getNext();
			l2 = l2.getNext();
		}
		return true;
	}

	public static boolean isPalindromeListNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		ListNode prev = null;
		// 快慢指针，并同时反转链表前半部分
		while (fast != null && fast.getNext() != null) {
			fast = fast.getNext().getNext();
			// 反转
			ListNode nextNode = slow.getNext();
			slow.setNext(prev);
			prev = slow;
			slow = nextNode;
		}
		ListNode prePre = slow;
		if (fast != null) {
			slow = slow.getNext();
		}
		// 比较值并反转还原前半部分
		boolean isPalindrome = true;
		while (prev != null) {
			if (slow.getVal() != prev.getVal()) {
				isPalindrome = false;
			}
			slow = slow.getNext();
			// 前半部分再次反转
			ListNode nextNode = prev.getNext();
			prev.setNext(prePre);
			prePre = prev;
			prev = nextNode;
		}
		return isPalindrome;
	}
}
