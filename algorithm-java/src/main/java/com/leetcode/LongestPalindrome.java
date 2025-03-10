package com.leetcode;

import com.util.StringUtils;

/**
 * leetcode 5 给你一个字符串s，找到s中最长的回文子串。
 * <p>
 * 如果字符串的反序与原始字符串相同，则该字符串称为回文字符串。
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

	/**
	 * 验证子串是否为回文
	 *
	 * @param content 原始字符串
	 * @param left    left
	 * @param right   right
	 * @return length
	 */
	private static int expandAroundCenter(String content, int left, int right) {
		int leftIdx = left;
		int rightIdx = right;
		while (leftIdx >= 0 && rightIdx < content.length() && content.charAt(leftIdx) == content.charAt(rightIdx)) {
			leftIdx--;
			rightIdx++;
		}
		return rightIdx - leftIdx - 1;
	}

	/**
	 * longest palindrome with dynamic programing
	 *
	 * @param content origin content
	 * @return palindrome content
	 */
	public static String dynamicLongestPalindrome(String content) {
		int len = content.length();
		if (len <= 1) {
			return content;
		}
		boolean[][] dp = new boolean[len][len];
		for (int idx = 0; idx < len; idx++) {
			dp[idx][idx] = true;
		}
		int maxLen = 1;
		int start = 0;
		char[] chars = content.toCharArray();
		for (int jdx = 1; jdx < len; jdx++) {
			for (int idx = 0; idx < jdx; idx++) {
				if (chars[idx] != chars[jdx]) {
					dp[idx][jdx] = false;
				} else {
					if (jdx - idx < 3) {
						dp[idx][jdx] = true;
					} else {
						dp[idx][jdx] = dp[idx + 1][jdx - 1];
					}
				}
				if (dp[idx][jdx] && jdx - idx + 1 > maxLen) {
					maxLen = jdx - idx + 1;
					start = idx;
				}
			}
		}
		return content.substring(start, start + maxLen);
	}
}
