package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestGenerateParentheses {

	@Test
	void test() {
		// case 1
		int caseOne = 3;
		System.out.println(GenerateParentheses.generateParentheses(caseOne));
		// case 2
		int caseTwo = 1;
		System.out.println(GenerateParentheses.generateParentheses(caseTwo));
	}
}
