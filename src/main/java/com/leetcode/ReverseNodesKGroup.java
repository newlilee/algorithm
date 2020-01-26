package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * 25. Reverse Nodes in k-Group
 *
 * @author clx
 */
public class ReverseNodesKGroup {

	/**
	 * reverse k group use recursive
	 *
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode reverseByRecursive(ListNode head, int k) {
		if (head == null || head.getNext() == null || k <= 0) {
			return head;
		}
		ListNode currNode = head;
		int count = 0;
		while (currNode != null && count != k) {
			currNode = currNode.getNext();
			count++;
		}
		if (count == k) {
			currNode = reverseByRecursive(currNode, k);
			while (count > 0) {
				ListNode tmp = head.getNext();
				head.setNext(currNode);
				currNode = head;
				head = tmp;
				count--;
			}
			head = currNode;
		}
		return head;
	}

	/**
	 * reverse k group use loop
	 *
	 * @param head
	 * @param k
	 * @return
	 */
	public static ListNode reverseByLoop(ListNode head, int k) {
		if (head == null || head.getNext() == null || k <= 0) {
			return head;
		}



		return null;
	}
}
