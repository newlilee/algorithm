package com.algorithm.chapterone.normal.third;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * FIFO implements by array
 * 
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
	 * resize the underlying array
	 * 
	 * @param capacity
	 */
	private void resize(int capacity) {
		assert capacity >= length;
		Item[] temp = (Item[]) new Object[capacity];
		for (int idx = 0; idx < length; idx++) {
			temp[idx] = array[(head + idx) % array.length];
		}
		array = temp;
		head = 0;
		tail = length;
	}

	/**
	 * enqueue
	 * 
	 * @param item
	 */
	public void enqueue(Item item) {
		if (this.isFull()) {
			this.resize(2 * array.length);
		}
		array[tail++] = item;
		if (tail == array.length) {
			tail = 0;
		}
		length++;
	}

	/**
	 * dequeue
	 * 
	 * @return
	 */
	public Item dequeue() {
		if (this.isEmpty()) {
			throw new NoSuchElementException("Queue underflow");
		}
		Item item = array[head];
		array[head] = null;
		length--;
		head++;
		if (head == array.length) {
			head = 0;
		}
		if (length > 0 && length == array.length / 4) {
			this.resize(array.length / 2);
		}
		return item;
	}

	/**
	 * peek least recently add item
	 * 
	 * @return
	 */
	public Item peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("Queue underflow");
		}
		return array[head];
	}

	@Override
	public Iterator<Item> iterator() {
		return new ArrayIterator();
	}

	/**
	 * iterator
	 */
	private class ArrayIterator implements Iterator<Item> {

		private int idx = 0;

		@Override
		public boolean hasNext() {
			return idx < length;
		}

		@Override
		public Item next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			Item item = array[(idx + head) % array.length];
			idx++;
			return item;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}
	}
}
