package com.algorithm.chapterone.normal.third;

/**
 * FixedCapacityStack
 * 
 * @author chenlixin at 2017年3月2日 上午10:05:21
 */
public class FixedCapacityStack<Item> {

	/**
	 * implement fixed capacity stack based on array
	 */
	private Item[] array;
	/**
	 * stack length;
	 */
	private int length;

	public FixedCapacityStack(int cap) {
		array = (Item[]) new Object[cap];
	}

	/**
	 * add an item
	 * 
	 * @param item
	 */
	public void push(Item item) {
		array[length++] = item;
	}

	/**
	 * remove an item
	 * 
	 * @return
	 */
	public Item pop() {
		return array[--length];
	}

	public boolean isEmpty() {
		return length == 0;
	}

	/**
	 * size of stack
	 * 
	 * @return
	 */
	public int size() {
		return length;
	}
}
