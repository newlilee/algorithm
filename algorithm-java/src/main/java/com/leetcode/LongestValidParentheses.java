package com.leetcode;

import java.util.Stack;

import com.util.StringUtils;

/**
 * 32. Longest Valid Parentheses 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 *
 * @author clx
 */
public class LongestValidParentheses {

	/**
	 * longest valid parentheses using stack
	 *
	 * @param content parentheses string
	 * @return longest valid parentheses length
	 */
	public static int longestValidParenthesesUseStack(String content) {
		if (StringUtils.isBlank(content)) {
			return 0;
		}
		Stack<Integer> charIdxStack = new Stack<>();
		int maxLen = 0;
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
			} else if (rightBrackets > leftBrackets) {
				leftBrackets = rightBrackets = 0;
			}
		}
		leftBrackets = rightBrackets = 0;
		for (int idx = content.length() - 1; idx >= 0; idx--) {
			if (content.charAt(idx) == '(') {
				leftBrackets++;
			} else {
				rightBrackets++;
			}
			if (leftBrackets == rightBrackets) {
				maxLen = Math.max(maxLen, 2 * rightBrackets);
			} else if (leftBrackets > rightBrackets) {
				leftBrackets = rightBrackets = 0;
			}
		}
		return maxLen;
	}
}
