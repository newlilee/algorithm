package com.leetcode;

import org.testng.annotations.Test;

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

	@Test
	void testDynamicLongestPalindrome() {
		// case 1
		String caseOne = "babad";
		System.out.println(LongestPalindrome.dynamicLongestPalindrome(caseOne));
		// case 2
		String caseTwo = "cbbd";
		System.out.println(LongestPalindrome.dynamicLongestPalindrome(caseTwo));
	}
}
