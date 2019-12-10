package com.leetcode;

import java.util.*;

/**
 * merge k lists leetcode's 23
 *
 * @author clx 4/22/2019
 */
public class MergeKLists {

	/**
	 * merge brute force
	 *
	 * @param lists
	 * @return
	 */
	public static List<Integer> mergeBruteForce(List<List<Integer>> lists) {
		if (lists == null || lists.isEmpty()) {
			return Collections.emptyList();
		}
		List<Integer> retList = new ArrayList<>();
		for (List<Integer> val : lists) {
			retList.addAll(val);
		}
		Collections.sort(retList);
		return retList;
	}

	/**
	 * brute force merge k lists
	 *
	 * @param listNodes
	 * @return
	 */
	public ListNode mergePriorityQueue(ListNode[] listNodes) {
		if (listNodes == null || listNodes.length == 0) {
			return null;
		}

		Queue<ListNode> queue = new PriorityQueue<>(listNodes.length, Comparator.comparing(ListNode::getVal));

		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		for (ListNode node : listNodes) {
			if (node != null) {
				queue.add(node);
			}
		}
		while (!queue.isEmpty()) {
			tail.next = queue.poll();
			tail = tail.next;

			if (tail.next != null) {
				queue.add(tail.next);
			}
		}
		return dummy.next;
	}

	/**
	 * list node
	 */
	private class ListNode {
		/**
		 * value of node
		 */
		private int val;
		/**
		 * next node
		 */
		private ListNode next;

		public ListNode(int val) {
			this.val = val;
		}

		public int getVal() {
			return val;
		}
	}
}
