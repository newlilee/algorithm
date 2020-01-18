package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * 21. Merge Two Sorted Lists
 *
 * @author clx
 */
public class MergeTwoSortedList {

	/**
	 * brute force
	 *
	 * @param first
	 * @param second
	 * @return
	 */
	public static ListNode mergeBruteForce(ListNode first, ListNode second) {
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}
		ListNode dummy = new ListNode(0);
		ListNode currNode = dummy;
		while (first != null && second != null) {
			if (first.getVal() <= second.getVal()) {
				currNode.setNext(first.getVal());
				first = first.getNext();
			} else {
				currNode.setNext(second.getVal());
				second = second.getNext();
			}
			currNode = currNode.getNext();
		}
		ListNode restNode = first == null ? second : first;
		currNode.setNext(restNode);
		return dummy.getNext();
	}

	/**
	 * @param first
	 * @param second
	 * @return
	 */
	public static ListNode merge(ListNode first, ListNode second) {


		return null;
	}
}
