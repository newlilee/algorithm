package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * leetcode.160
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 *
 * @author clx
 */
public class IntersectionNode {

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode a = headA;
		ListNode b = headB;
		while (a != b) {
			a = (a == null ? headB : a.getNext());
			b = (b == null ? headA : b.getNext());
		}
		return a;
	}
}
