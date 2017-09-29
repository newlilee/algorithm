package com.algorithm.chapterone.normal;

import java.util.Iterator;

/**
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

	public boolean isEmpty() {
		return first == null;// len == 0;
	}

	public int size() {
		return len;
	}

	@Override
	public Iterator<Item> iterator() {
		return new LinkedIterator();
	}

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

	private class Node {
		Item item;
		Node next;
	}
}
