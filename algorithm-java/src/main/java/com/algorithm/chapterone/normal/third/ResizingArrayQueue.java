package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
 * @author clx 2018/4/20.
 */
public class ResizingArrayQueue<Item> implements Iterable<Item> {

	/**
	 * array
	 */
	private Item[] array;
	/**
	 * head's index
	 */
	private int head;
	/**
	 * tail's index
	 */
	private int tail;
	/**
	 * queue's length
	 */
	private int length;

	public ResizingArrayQueue() {
		this.array = (Item[]) new Object[2];
		this.head = 0;
		this.tail = 0;
		this.length = 0;
	}

	/**
	 * is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return length == 0;
	}

	/**
	 * queue's size
	 * 
	 * @return
	 */
	public int size() {
		return length;
	}

	/**
	 * is full
	 * 
	 * @return
	 */
	public boolean isFull() {
		return length == array.length;
	}

	/**
	 * resize
	 * 
	 * @param capacity
	 */
	private void resize(int capacity) {

	}

	/**
	 * enqueue
	 * 
	 * @param item
	 */
	public void enqueue(Item item) {

	}

	/**
	 * dequeue
	 * 
	 * @return
	 */
	public Item dequeue() {

		return null;
	}

	/**
	 * peek least recently add item
	 * 
	 * @return
	 */
	public Item peek() {

		return null;
	}

	@Override
	public Iterator<Item> iterator() {
		return new ArrayIterator();
	}

	/**
	 * iterator
	 */
	private class ArrayIterator implements Iterator<Item> {

		@Override
		public boolean hasNext() {
			return false;
		}

		@Override
		public Item next() {
			return null;
		}

		@Override
		public void remove() {

		}
	}
}
