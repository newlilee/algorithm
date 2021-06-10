package com.leetcode;


import com.util.StringUtils;

import java.util.Stack;

/**
 * 32. Longest Valid Parentheses
 *
 * @author clx
 */
public class LongestValidParentheses {

	/**
	 * longest valid parentheses using stack
	 *
	 * @param content
	 * @return
	 */
	public static int longestValidParenthesesUseStack(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}
		int maxLen = 0;
		Stack<Integer> charIdxStack = new Stack<>();
		charIdxStack.push(-1);
		for (int idx = 0; idx < content.length(); idx++) {
			if (content.charAt(idx) == '(') {
				charIdxStack.push(idx);
			} else {
				charIdxStack.pop();
				if (charIdxStack.isEmpty()) {
					charIdxStack.push(idx);
				} else {
					maxLen = Math.max(maxLen, idx - charIdxStack.peek());
				}
			}
		}
		return maxLen;
	}

	/**
	 * longest valid parentheses
	 *
	 * @param content
	 * @return
	 */
	public static int longestValidParentheses(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}
		int maxLen = 0;
		int leftBrackets = 0;
		int rightBrackets = 0;
		for (int idx = 0; idx < content.length(); idx++) {
			if (content.charAt(idx) == '(') {
				leftBrackets++;
			} else {
				rightBrackets++;
			}
			if (leftBrackets == rightBrackets) {
				maxLen = Math.max(maxLen, 2 * leftBrackets);
			} else if (leftBrackets > rightBrackets) {
				leftBrackets = rightBrackets = 0;
			}
		}
		for (int idx = content.length() - 1; idx > 0; idx--) {
			if (content.charAt(idx) == '(') {
				leftBrackets++;
			} else {
				rightBrackets++;
			}
			if (leftBrackets == rightBrackets) {
				maxLen = Math.max(maxLen, 2 * rightBrackets);
			} else if (rightBrackets > leftBrackets) {
				leftBrackets = rightBrackets = 0;
			}
		}
		return maxLen;
	}
}
