package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

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
