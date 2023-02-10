package com.leetcode;

import org.junit.jupiter.api.Test;

public class TestLongestPalindrome {

	@Test
	void testLongestPalindrome() {
		// case 1
		String caseOne = "babad";
		System.out.println(LongestPalindrome.longestPalindrome(caseOne));
		// case 2
		String caseTwo = "cbbd";
		System.out.println(LongestPalindrome.longestPalindrome(caseTwo));
	}
}
