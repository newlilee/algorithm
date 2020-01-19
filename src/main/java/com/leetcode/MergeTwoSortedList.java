package com.leetcode;

import com.leetcode.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

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
	 * use priority queue
	 *
	 * @param first
	 * @param second
	 * @return
	 */
	public static ListNode merge(ListNode first, ListNode second) {
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}
		PriorityQueue<ListNode> queue = new PriorityQueue<>(Comparator.comparing(ListNode::getVal));
		while (first != null || second != null) {
			if (first != null) {
				queue.add(first);
				first = first.getNext();
			}
			if (second != null) {
				queue.add(second);
				second = second.getNext();
			}
		}

		ListNode dummy = new ListNode(0);
		ListNode currNode = dummy;
		while (!queue.isEmpty()) {
			currNode.setNext(queue.poll());
			currNode = currNode.getNext();
		}
		return dummy.getNext();
	}
}
