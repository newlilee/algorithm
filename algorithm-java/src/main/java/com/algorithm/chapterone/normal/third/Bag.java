package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
 * Bag
 * 
 * @author chenlixin at 2017年2月21日 上午11:34:58
 */
public class Bag<Item> implements Iterable<Item> {

	/**
	 * first node
	 */
	private Node first;

	@Override
	public Iterator<Item> iterator() {
		return new ListIterator();
	}

	public Bag() {
	}

	public void add(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}

	public boolean isEmpty() {
		return false;
	}

	public Integer size() {
		return null;
	}

	private class Node {
		Item item;
		Node next;
	}

	private class ListIterator implements Iterator<Item> {

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
