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
		if (head == null || head.getNext() == null || k <= 1) {
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
				ListNode nextNode = head.getNext();
				head.setNext(currNode);
				currNode = head;
				head = nextNode;
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
		if (head == null || head.getNext() == null || k <= 1) {
			return head;
		}
		ListNode dummy = new ListNode(0);
		dummy.setNext(head);
		ListNode preNode = dummy;
		int idx = 0;
		while (head != null) {
			idx++;
			if (idx % k == 0) {
				preNode = reverse(preNode, head.getNext());
				head = preNode.getNext();
			} else {
				head = head.getNext();
			}
		}
		return dummy.getNext();
	}

	/**
	 * reverse
	 *
	 * @param preNode
	 * @param next
	 * @return
	 */
	private static ListNode reverse(ListNode preNode, ListNode next) {
		ListNode tailNode = preNode.getNext();
		ListNode curr = tailNode.getNext();
		while (curr != next) {
			tailNode.setNext(curr.getNext());
			curr.setNext(preNode.getNext());
			preNode.setNext(curr);
			curr = tailNode.getNext();
		}
		return tailNode;
	}
}
