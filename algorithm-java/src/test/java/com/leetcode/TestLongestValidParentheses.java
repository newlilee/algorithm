package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestLongestValidParentheses {

	@Test
	void testValidParentheses() {
		// case 1
		String caseOne = "(()";
		System.out.println(LongestValidParentheses.longestValidParenthesesUseStack(caseOne));
		// case 2
		String caseTwo = ")()())";
		System.out.println(LongestValidParentheses.longestValidParenthesesUseStack(caseTwo));
		// case 3
		String caseThree = "";
		System.out.println(LongestValidParentheses.longestValidParenthesesUseStack(caseThree));
	}

	@Test
	void testLongestValidParentheses() {
		// case 1
		String caseOne = "(()";
		System.out.println(LongestValidParentheses.longestValidParentheses(caseOne));
		// case 2
		String caseTwo = ")()())";
		System.out.println(LongestValidParentheses.longestValidParentheses(caseTwo));
		// case 3
		String caseThree = "";
		System.out.println(LongestValidParentheses.longestValidParentheses(caseThree));
	}
}
