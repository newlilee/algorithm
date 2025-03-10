package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
 * resizing array stack
 * 
 * @author chenlixin at 2017年3月2日 下午4:04:28
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

	/**
	 * implement none fixed capacity stack based on array
	 */
	private Item[] array;
	/**
	 * stack length
	 */
	private int len;

	public ResizingArrayStack(int cap) {
		array = (Item[]) new Object[cap];
	}

	/**
	 * push
	 * 
	 * @param item
	 */
	public void push(Item item) {
		if (isFull()) {
			this.resize(2 * array.length);
		}
		array[len++] = item;
	}

	/**
	 * pop
	 * 
	 * @return
	 */
	public Item pop() {
		Item item = array[--len];
		array[len] = null;
		if (len > 0 && len == array.length / 4) {
			this.resize(array.length / 2);
		}
		return item;
	}

	/**
	 * stack is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return len == 0;
	}

	/**
	 * stack is full
	 * 
	 * @return
	 */
	public boolean isFull() {
		return len == array.length;
	}

	/**
	 * size of stack
	 * 
	 * @return
	 */
	public int size() {
		return len;
	}

	/**
	 * resize stack with param max
	 * 
	 * @param max
	 */
	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int index = 0; index < len; index++) {
			temp[index] = array[index];
		}
		array = temp;
		System.out.println("current array size:" + array.length);
	}

	@Override
	public Iterator<Item> iterator() {
		return new ReserveArrayIterator();
	}

	private class ReserveArrayIterator implements Iterator<Item> {

		@Override
		public boolean hasNext() {
			return len > 0;
		}

		@Override
		public Item next() {
			return array[--len];
		}

		@Override
		public void remove() {
		}
	}
}
