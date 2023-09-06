package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestIntersectionNode {

	@Test
	public void testIntersectionNode() {
		// case 1
		ListNode headA = new ListNode().initListNode(new int[]{4, 1, 8, 4, 5});
		System.out.println(headA);
		ListNode headB = new ListNode().initListNode(new int[]{5, 6, 1, 8, 4, 5});
		System.out.println(headB);
		System.out.println(IntersectionNode.getIntersectionNode(headA, headB));
	}
}
