package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestLongestSubstring {

	@Test
	public void testLongestSubstring() {
//		String content = "abcabcbb";
//		String content = "bbbbb";
		String content = "pwwkew";
		int result = LongestSubstring.longestSubstring(content);
		System.out.println(result);
	}
}
