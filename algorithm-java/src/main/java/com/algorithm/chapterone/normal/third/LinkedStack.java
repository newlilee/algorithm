package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
 * LIFO stack implement by linked table
 * 
 * @author chenlixin at 2017年3月8日 上午10:44:08
 */
public class LinkedStack<Item> implements Iterable<Item> {

	/**
	 * first node
	 */
	private Node first;
	/**
	 * length of stack
	 */
	private int len;

	/**
	 * push element
	 *
	 * @param item
	 */
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		len++;
	}

	/**
	 * pop element
	 */
	public Item pop() {
		Item item = first.item;
		first = first.next;
		len--;
		return item;
	}

	/**
	 * Returns true if this list contains no elements
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// len == 0;
		return first == null;
	}

	public int size() {
		return len;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Node
	 */
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
