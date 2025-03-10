package com.leetcode;

import org.testng.annotations.Test;

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
	void testSlideWindow() {
		// case 1
		String caseOneContent = "abcabcbb";
		System.out.println(LongestSubstring.slideWindow(caseOneContent));
		// case 2
		String caseTwoContent = "bbbbb";
		System.out.println(LongestSubstring.slideWindow(caseTwoContent));
		// case 3
		String caseThreeContent = "pwwkew";
		System.out.println(LongestSubstring.slideWindow(caseThreeContent));
	}

	@Test
	void testSlideWindowEnhance() {
		// case 1
		String caseOneContent = "abcabcbb";
		System.out.println(LongestSubstring.slideWindowEnhance(caseOneContent));
		// case 2
		String caseTwoContent = "bbbbb";
		System.out.println(LongestSubstring.slideWindowEnhance(caseTwoContent));
		// case 3
		String caseThreeContent = "pwwkew";
		System.out.println(LongestSubstring.slideWindowEnhance(caseThreeContent));
	}

	@Test
	void testLengthOfLongestSubstring() {
		// case 1
		String caseOneContent = "abcabcbb";
		System.out.println(LongestSubstring.lengthOfLongestSubstring(caseOneContent));
		// case 2
		String caseTwoContent = "bbbbb";
		System.out.println(LongestSubstring.lengthOfLongestSubstring(caseTwoContent));
		// case 3
		String caseThreeContent = "pwwkew";
		System.out.println(LongestSubstring.lengthOfLongestSubstring(caseThreeContent));
	}
}
