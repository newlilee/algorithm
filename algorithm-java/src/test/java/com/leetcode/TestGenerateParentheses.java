package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestGenerateParentheses {

	@Test
	public void test() {
		int num = 3;
		List<String> result = GenerateParentheses.generateParentheses(num);
		System.out.println(result);
	}
}
