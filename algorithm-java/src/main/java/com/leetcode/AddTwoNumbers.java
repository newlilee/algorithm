package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * leetcode 2
 * 
 * @author clx 2019-05-18
 */
public class AddTwoNumbers {

	public ListNode addTwoNum(ListNode first, ListNode second) {
		if (first == null || second == null) {
			return null;
		}
		ListNode finalHead = new ListNode(0);
		ListNode p = first;
		ListNode q = second;
		ListNode curr = finalHead;
		int carry = 0;
		while (p != null || q != null) {
			int idx = (p != null) ? p.getVal() : 0;
			int jdx = (q != null) ? q.getVal() : 0;
			int sum = carry + idx + jdx;
			carry = sum / 10;
			curr.setNext(new ListNode(sum % 10));
			curr = curr.getNext();
			if (p != null) {
				p = p.getNext();
			}
			if (q != null) {
				q = q.getNext();
			}
		}
		if (carry > 0) {
			curr.setNext(new ListNode(carry));
		}
		return finalHead.getNext();
	}
}
