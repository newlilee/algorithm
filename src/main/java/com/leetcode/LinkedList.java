package com.leetcode;

/**
 * @author clx 4/21/2019
 */
public class LinkedList {

	/**
	 * linked list node
	 */
	public class Node {
		/**
		 * current node data
		 */
		int val;
		/**
		 * next node
		 */
		Node next;

		public Node(int val) {
			this.val = val;
		}

		@Override
		public String toString() {
			return "Node{" + "val=" + val + ", next=" + next + '}';
		}
	}

	/**
	 * reverse linked list
	 * 
	 * @param head
	 */
	public static Node reverseLinkedList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node reverseHead = reverseLinkedList(head.next);
		head.next.next = head;
		head.next = null;
		return reverseHead;
	}

	/**
	 * reverse linked list
	 * 
	 * @param head
	 * @return
	 */
	public static Node reverseList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node preNode = head;
		Node currNode = head.next;
		Node tmpNode;
		while (currNode != null) {
			tmpNode = currNode.next;
			currNode.next = preNode;
			preNode = currNode;
			currNode = tmpNode;
		}
		head.next = null;
		return head;
	}

}
