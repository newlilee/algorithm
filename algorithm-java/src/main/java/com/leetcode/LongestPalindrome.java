package com.leetcode;

import org.apache.commons.lang3.StringUtils;

/**
 * leetcode's 5 longestPalindrome
 *
 * @author clx
 */
public class LongestPalindrome {

	public static String longestPalindrome(String content) {
		if (StringUtils.isBlank(content)) {
			return StringUtils.EMPTY;
		}
		int start = 0;
		int end = 0;
		for (int idx = 0; idx < content.length(); idx++) {
			int firstLen = expandAroundCenter(content, idx, idx);
			int secondLen = expandAroundCenter(content, idx, idx + 1);
			int len = Math.max(firstLen, secondLen);
			if (len > end - start) {
				start = idx - (len - 1) / 2;
				end = idx + len / 2;
			}
		}
		return content.substring(start, end + 1);
	}

	private static int expandAroundCenter(String content, int left, int right) {
		int leftIdx = left;
		int rightIdx = right;
		while (leftIdx >= 0 && rightIdx < content.length() && content.charAt(leftIdx) == content.charAt(rightIdx)) {
			leftIdx--;
			rightIdx++;
		}
		return rightIdx - leftIdx - 1;
	}
}
