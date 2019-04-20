package com.leetcode;

import java.util.Random;
import java.util.Stack;

import org.junit.Test;

/**
 * @author clx 4/18/2019
 */
public class TestStackSort {

	@Test
	public void testSortStack() {
		Stack<Integer> stack = new Stack<>();
		for (int idx = 0; idx < 10; idx++) {
			stack.push(new Random().nextInt(10));
		}
		System.out.println(stack);
		StackSort.sortStack(stack);
		System.out.println(stack);
	}
}
