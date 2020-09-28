package com.leetcode;

import org.junit.jupiter.api.Test;

public class TestLongestPalindrome {

	@Test
	public void testLongestPalindrome() {
		String content = "babad";
		String result = LongestPalindrome.longestPalindrome(content);
		System.out.println(result);
	}
}
