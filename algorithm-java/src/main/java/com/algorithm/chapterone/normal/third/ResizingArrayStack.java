package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
 * @author chenlixin at 2017年3月2日 下午4:04:28
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

	private Item[] array;
	private int len;

	public ResizingArrayStack(int cap) {
		array = (Item[]) new Object[cap];
	}

	public void push(Item item) {
		if (isFull()) {
			resize(2 * array.length);
		}
		array[len++] = item;
	}

	public Item pop() {
		Item item = array[--len];
		array[len] = null;
		if (len > 0 && len == array.length / 4) {
			resize(array.length / 2);
		}
		return item;
	}

	public boolean isEmpty() {
		return len == 0;
	}

	public boolean isFull() {
		return len == array.length;
	}

	public int size() {
		return len;
	}

	private void resize(int max) {
		Item[] temp = (Item[]) new Object[max];
		for (int index = 0; index < len; index++) {
			temp[index] = array[index];
		}
		array = temp;
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
