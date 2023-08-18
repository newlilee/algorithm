package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestBuildLongestPalindrome {

	@Test
	public void testLongestPalindrome() {
		// case 1
		String caseOne = "abccccdd";
		System.out.println(BuildLongestPalindrome.longestPalindrome(caseOne));

		// case 2
		String caseTwo = "a";
		System.out.println(BuildLongestPalindrome.longestPalindrome(caseTwo));

		// case 3
		String caseThree = "aaaaaccc";
		System.out.println(BuildLongestPalindrome.longestPalindrome(caseThree));
	}
}
