package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestPalindromePartitioning {

	@Test
	public void testPalindrome() {
		String content = "aab";
		List<List<String>> result = PalindromePartitioning.palindrome(content);
		System.out.println(result);
	}
}
