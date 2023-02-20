package com.leetcode;

import com.leetcode.common.ListNode;

import java.util.PriorityQueue;

/**
 * leetcode 23. merge k lists
 * <p>
 * 给你一个链表数组，每个链表都已经按升序排列。
 * <p>
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 *
 * @author clx 4/22/2019
 */
public class MergeKLists {

	/**
	 * merge k lists by priority queue
	 *
	 * @param listNodes listNode array
	 * @return sorted listNode
	 */
	public static ListNode mergePriorityQueue(ListNode[] listNodes) {
		if (listNodes == null || listNodes.length == 0) {
			return null;
		}

		PriorityQueue<Integer> queue = new PriorityQueue<>();
		for (ListNode node : listNodes) {
			while (node != null) {
				queue.add(node.getVal());
				node = node.getNext();
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
