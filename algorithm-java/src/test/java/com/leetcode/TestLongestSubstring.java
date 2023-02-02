package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestLongestSubstring {

	@Test
	void testLongestSubstring() {
		// case 1
		String caseOneContent = "abcabcbb";
		System.out.println(LongestSubstring.longestSubstring(caseOneContent));
		// case 2
		String caseTwoContent = "bbbbb";
		System.out.println(LongestSubstring.longestSubstring(caseTwoContent));
		// case 3
		String caseThreeContent = "pwwkew";
		System.out.println(LongestSubstring.longestSubstring(caseThreeContent));
	}

	@Test
	public void testSlideWindow() {
//		String content = "abcabcbb";
//		String content = "bbbbb";
		String content = "pwwkew";
		int result = LongestSubstring.slideWindow(content);
		System.out.println(result);
	}

	@Test
	public void testSlideWindowEnhance() {
		String content = "abcabcbb";
//		String content = "bbbbb";
//		String content = "pwwkew";
		int result = LongestSubstring.slideWindowEnhance(content);
		System.out.println(result);
	}

	@Test
	public void testLengthOfLongestSubstring() {
		String content = "abcabcbb";
//		String content = "bbbbb";
//		String content = "pwwkew";
		int result = LongestSubstring.lengthOfLongestSubstring(content);
		System.out.println(result);
	}
}
