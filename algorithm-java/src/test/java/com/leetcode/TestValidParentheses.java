package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestValidParentheses {

	@Test
	void testValid() {
		// case 1
		String caseOne = "()";
		System.out.println(ValidParentheses.isValid(caseOne));
		// case 2
		String caseTwo = "()[{}]{}";
		System.out.println(ValidParentheses.isValid(caseTwo));
		// case 3
		String caseThree = "(]";
		System.out.println(ValidParentheses.isValid(caseThree));
	}
}
