package com.algorithm.chapterone.normal.third;

import java.util.Iterator;

/**
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

	public boolean isEmpty() {
		return first == null;// len == 0;
	}

	public int size() {
		return len;
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	private class Node {
		Item item;
		Node next;
	}
}
