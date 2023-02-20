package com.leetcode.common;


import java.util.Objects;

/**
 * common list node
 *
 * @author clx
 */
public class ListNode {

	/**
	 * listNode value
	 */
	private int val;
	/**
	 * next listNode
	 */
	private ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public int getVal() {
		return this.val;
	}

	public ListNode setNext(ListNode next) {
		this.next = next;
		return this;
	}

	public ListNode getNext() {
		return this.next;
	}

	public ListNode setNext(int val) {
		this.next = new ListNode(val);
		return next;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(32);
		ListNode currNode = this;
		while (currNode != null) {
			builder.append(currNode.getVal()).append("->");
			currNode = currNode.getNext();
		}
		int len = builder.length();
		if (len > 2) {
			builder.setLength(len - 2);
		}
		return builder.toString();
	}

	/**
	 * init list node with array
	 *
	 * @param initArr array
	 * @return {@link ListNode}
	 */
	public ListNode initListNode(int[] initArr) {
		if (Objects.isNull(initArr) || initArr.length == 0) {
			return new ListNode();
		}
		ListNode head = new ListNode(initArr[0]);
		ListNode currNode = head;
		for (int idx = 1; idx < initArr.length; idx++) {
			currNode.setNext(initArr[idx]);
			currNode = currNode.getNext();
		}
		return head;
	}
}