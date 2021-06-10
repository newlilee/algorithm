package com.leetcode;


import com.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
 * leetcode 3 lengthOfLongestSubstring
 *
 * @author clx
 */
public class LongestSubstring {

	/**
	 * bruce force longestSubstring
	 *
	 * @param content
	 * @return
	 */
	public static int longestSubstring(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}
		LinkedList<String> substrList = new LinkedList<>();
		int len = content.length();
		int lastMaxLength = -1;
		for (int idx = 0; idx < len; idx++) {
			for (int jdx = len; jdx > idx; jdx--) {
				String substr = content.substring(idx, jdx);
				int currMaxLength = substr.length();
				if (!checkCharRepeat(substr)) {
					if (currMaxLength > lastMaxLength) {
						lastMaxLength = currMaxLength;
						substrList.addFirst(substr);
					}
				}
			}
		}
		if (!substrList.isEmpty()) {
			return substrList.get(0).length();
		}
		return -1;
	}

	/**
	 * check char repeat
	 *
	 * @param substr
	 * @return
	 */
	private static boolean checkCharRepeat(String substr) {
		int len = substr.length();
		if (len == 1) {
			return false;
		}
		for (int idx = 0; idx < len; idx++) {
			char ch = substr.charAt(idx);
			int nextIdx = substr.lastIndexOf(ch);
			if (idx != nextIdx) {
				return true;
			}
		}
		return false;
	}

	/**
	 * longest substr with slide window
	 *
	 * @param content
	 * @return
	 */
	public static int slideWindow(String content) {
		if (StringUtils.isBlank(content)) {
			return -1;
		}
		int len = content.length();
		Set<Character> substr = new HashSet<>();
		int maxLen = 0;
		int idx = 0;
		int jdx = 0;
		while (idx < len && jdx < len) {
			if (!substr.contains(content.charAt(jdx))) {
				substr.add(content.charAt(jdx++));
				maxLen = Math.max(maxLen, jdx - idx);
			} else {
				substr.remove(content.charAt(idx++));
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
