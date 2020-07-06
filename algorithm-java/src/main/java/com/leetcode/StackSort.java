package com.leetcode;

import java.util.Stack;

/**
 * sort stack
 * 
 * @author clx 4/18/2019
 */
public class StackSort {

	/**
	 * sort
	 * 
	 * @param srcStack
	 * @return
	 */
	public static void sortStack(Stack<Integer> srcStack) {
		if (srcStack == null || srcStack.size() == 0) {
			return;
		}
		Stack<Integer> tmpStack = new Stack<>();
		tmpStack.push(srcStack.pop());
		int top;
		while (!srcStack.isEmpty()) {
			top = srcStack.pop();
			while (!tmpStack.isEmpty() && top > tmpStack.peek()) {
				srcStack.push(tmpStack.pop());
			}
			tmpStack.push(top);
		}
		while (!tmpStack.isEmpty()) {
			srcStack.push(tmpStack.pop());
		}
	}
}
