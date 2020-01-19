package com.leetcode;

import com.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

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
	 * merge k lists by priority queue
	 *
	 * @param listNodes
	 * @return
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
