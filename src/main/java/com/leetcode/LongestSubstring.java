package com.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.util.LinkedList;

/**
 * leetcode's 3
 * lengthOfLongestSubstring
 *
 * @author clx
 */
public class LongestSubstring {

	/**
	 * longestSubstring
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
}
