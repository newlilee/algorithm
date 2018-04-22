package com.algorithm.chapterone.normal.third;

import java.util.Iterator;
import java.util.Random;

/**
 * @author clx 2018/4/22
 */
public class TestResizingArrayQueue {
	private static Random random = new Random();

	public static void main(String[] args) {
		ResizingArrayQueue<Integer> stack = new ResizingArrayQueue<>();
		for (int idx = 0; idx < 50; idx++) {
			stack.enqueue(random.nextInt());
		}
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(stack.dequeue());
		}
	}
}
