package com.leetcode;

import org.apache.commons.lang3.StringUtils;

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
	public static int longestValidParentheses(String content) {
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
}
