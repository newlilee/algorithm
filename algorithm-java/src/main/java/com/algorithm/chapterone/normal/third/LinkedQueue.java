package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
 * FIFO queue implement by linked table
 * 
 * @author chenlixin at 2017年3月8日 下午12:00:52
 */
public class LinkedQueue<Item> implements Iterable<Item> {

	/**
	 * first element
	 */
	private Node first;

	/**
	 * last element
	 */
	private Node last;

	/**
	 * length of queue
	 */
	private int len;

	/**
	 * enqueue element
	 *
	 * @param item
	 */
	public void enqueue(Item item) {
		Node oldLast = last;
		last.item = item;
		last.next = null;
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
		len++;
	}

	/**
	 * dequeue element
	 */
	public Item dequeue() {
		Item item = first.item;
		first = first.next;
		if (isEmpty()) {
			last = null;
		}
		len--;
		return item;
	}

	/**
	 * Returns true if this list contains no elements.
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return len == 0;
		// return first == null;
	}

	/**
	 * queue size
	 * 
	 * @return
	 */
	public int size() {
		return len;
	}

	@Override
	public Iterator<Item> iterator() {
		return new LinkedIterator();
	}

	/**
	 * iterator
	 */
	private class LinkedIterator implements Iterator<Item> {

		private Node current = first;

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
		}
	}

	/**
	 * Node
	 */
	private class Node {
		/**
		 * current node data
		 */
		Item item;
		/**
		 * next node
		 */
		Node next;
	}
}
