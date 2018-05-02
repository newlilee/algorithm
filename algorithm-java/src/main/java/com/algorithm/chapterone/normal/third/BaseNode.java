package com.algorithm.chapterone.normal.third;

/**
 * node structure
 * 
 * @author clx 2018/5/2.
 */
public class BaseNode<Item> {

	/**
	 * first node
	 */
	private Node first;
	/**
	 * last node
	 */
	private Node last;
	/**
	 * table length
	 */
	private int len;

	/**
	 * add node from table's head
	 * 
	 * @param item
	 */
	private void addFromFirst(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}

	/**
	 * remove node from table's head
	 * 
	 * @return
	 */
	private Item removeFirstNode() {
		Item item = (Item) first.item;
		first = first.next;
		return item;
	}

	/**
	 * add node from table's tail
	 * 
	 * @param item
	 */
	private void addFromLast(Item item) {
		Node node = new Node();
		node.item = item;
		last.next = node;
	}

	/**
	 * remove last node
	 * 
	 * @return
	 */
	private Item removeLastNode() {
		// TODO:delete node from linked table tail
		return null;
	}

	private class Node {
		/**
		 * current node data
		 */
		private Item item;
		/**
		 * next node
		 */
		private Node next;
	}
}
