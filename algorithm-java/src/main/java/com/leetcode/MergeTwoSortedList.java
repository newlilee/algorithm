package com.leetcode;

import com.leetcode.common.ListNode;

import java.util.PriorityQueue;

/**
 * leetcode.21. Merge Two Sorted Lists
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
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
		if (first == null && second == null) {
			return null;
		}
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
	public static ListNode mergeByPriorityQueue(ListNode first, ListNode second) {
		if (first == null && second == null) {
			return null;
		}
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		while (first != null || second != null) {
			if (first != null) {
				queue.add(first.getVal());
				first = first.getNext();
			}
			if (second != null) {
				queue.add(second.getVal());
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
