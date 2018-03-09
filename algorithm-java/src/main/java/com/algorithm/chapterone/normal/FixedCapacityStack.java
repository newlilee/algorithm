package com.algorithm.chapterone.normal;

/**
 * @author chenlixin at 2017年3月2日 上午10:05:21
 */
public class FixedCapacityStack<T> {

	private T[] array;
	private int len;

	public FixedCapacityStack(Integer cap) {
		array = (T[]) new Object[cap];
	}

	public void push(T t) {
		array[len++] = t;
	}

	public T pop() {
		return array[--len];
	}

	public boolean isEmpty() {
		return len == 0;
	}

	public int size() {
		return len;
	}
}
