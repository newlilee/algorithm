package com.algorithm.chapterone.normal.third;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * @author clx 2018/4/20.
 */
public class TestResizingArrayStack {

	private static Random random = new Random();

	public static void main(String[] args) {
		ResizingArrayStack<Integer> stack = new ResizingArrayStack<>(10);
		for (int idx = 0; idx < 20; idx++) {
			stack.push(random.nextInt());
		}
		Iterator<Integer> iterator = stack.iterator();
		while (iterator.hasNext()) {
			System.out.println(stack.pop());
		}
	}
}
