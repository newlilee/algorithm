package com.leetcode;


import com.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * leetcode 3
 * 给定一个字符串s，请你找出其中不含有重复字符的最长子串的长度。
 *
 * @author clx
 */
public class LongestSubstring {

	/**
	 * bruce force longestSubstring
	 *
	 * @param content str
	 * @return length of no repeat substring
	 */
	public static int longestSubstring(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}
		LinkedList<String> substringList = new LinkedList<>();
		int len = content.length();
		int lastMaxLength = -1;
		for (int idx = 0; idx < len; idx++) {
			for (int jdx = len; jdx > idx; jdx--) {
				String substring = content.substring(idx, jdx);
				int currMaxLength = substring.length();
				if (!checkCharRepeat(substring) && currMaxLength > lastMaxLength) {
					lastMaxLength = currMaxLength;
					substringList.addFirst(substring);
				}
			}
		}
		if (!substringList.isEmpty()) {
			return substringList.get(0).length();
		}
		return -1;
	}

	/**
	 * check char repeat
	 *
	 * @param substring max substring
	 * @return bool
	 */
	private static boolean checkCharRepeat(String substring) {
		int len = substring.length();
		if (len == 1) {
			return false;
		}
		for (int idx = 0; idx < len; idx++) {
			char ch = substring.charAt(idx);
			int nextIdx = substring.lastIndexOf(ch);
			if (idx != nextIdx) {
				return true;
			}
		}
		return false;
	}

	/**
	 * longest substring with slide window
	 *
	 * @param content str
	 * @return length
	 */
	public static int slideWindow(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}
		int len = content.length();
		Set<Character> substring = new HashSet<>();
		int maxLen = 0;
		int idx = 0;
		int jdx = 0;
		while (idx < len && jdx < len) {
			if (!substring.contains(content.charAt(jdx))) {
				substring.add(content.charAt(jdx++));
				maxLen = Math.max(maxLen, jdx - idx);
			} else {
				substring.remove(content.charAt(idx++));
			}
		}
		return maxLen;
	}

	/**
	 * longest substr with slide window
	 *
	 * @param content
	 * @return
	 */
	public static int slideWindowEnhance(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}
		int len = content.length();
		int maxLen = 0;
		Map<Character, Integer> substr = new HashMap<>();
		for (int idx = 0, jdx = 0; jdx < len; jdx++) {
			if (substr.containsKey(content.charAt(jdx))) {
				idx = Math.max(substr.get(content.charAt(jdx)), idx);
			}
			maxLen = Math.max(maxLen, jdx - idx + 1);
			substr.put(content.charAt(jdx), jdx + 1);
		}
		return maxLen;
	}

	/**
	 * slide window
	 *
	 * @param content
	 * @return
	 */
	public static int lengthOfLongestSubstring(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}

		int left = 0;
		int right = 0;
		Map<Character, Integer> window = new HashMap<>(content.length());
		int maxLength = 0;
		while (right < content.length()) {
			char c1 = content.charAt(right);
			window.put(c1, window.getOrDefault(c1, 0) + 1);
			right++;
			while (window.get(c1) > 1) {
				char c2 = content.charAt(left);
				window.put(c2, window.get(c2) - 1);
				left++;
			}
			maxLength = Math.max(maxLength, right - left);
		}
		return maxLength;
	}
}
