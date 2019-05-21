package com.leetcode.common;

/**
 * common list node
 * 
 * @author clx 2019-05-21
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
}
