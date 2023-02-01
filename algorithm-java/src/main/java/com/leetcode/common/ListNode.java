package com.leetcode.common;


/**
 * common list node
 *
 * @author clx
 */
public class ListNode {

	/**
	 * listNode value
	 */
	private Integer val;
	/**
	 * next listNode
	 */
	private ListNode next;

	public ListNode() {
	}

	public ListNode(Integer val) {
		this.val = val;
	}

	public Integer getVal() {
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
}




















