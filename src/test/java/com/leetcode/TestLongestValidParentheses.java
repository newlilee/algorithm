package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestLongestValidParentheses {

	@Test
	public void testValidParentheses() {
		String content = ")()())";
		int result = LongestValidParentheses.longestValidParentheses(content);
		System.out.println("result:" + result);
	}
}
