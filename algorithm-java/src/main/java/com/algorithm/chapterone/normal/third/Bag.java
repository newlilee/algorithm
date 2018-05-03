package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
 * Bag implement by linked table
 * 
 * @author chenlixin at 2017年2月21日 上午11:34:58
 */
public class Bag<Item> implements Iterable<Item> {

	/**
	 * first node
	 */
	private Node first;
	/**
	 * length of bag
	 */
	private int len;

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	/**
	 * constructor Bag
	 */
	public Bag() {
	}

	/**
	 * add element
	 * 
	 * @param item
	 */
	public void add(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		len++;
	}

	/**
	 * Returns true if this list contains no elements.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// return len == 0;
		return first == null;
	}

	/**
	 * size
	 * 
	 * @return size
	 */
	public Integer size() {
		return len;
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

	/**
	 * Iterator
	 */
	private class ListIterator implements Iterator<Item> {

		/**
		 * current node
		 */
		private Node current = first;

		@Override
		public boolean hasNext() {
			return current == null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
		}
	}
}
