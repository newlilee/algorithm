package com.leetcode;


import com.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 *
 * @author clx
 */
public class MinimumWindowSubstring {

	/**
	 * @param s s
	 * @param t t
	 * @return min string
	 */
	public static String minWindow(String s, String t) {
		if (StringUtils.isBlank(s) || StringUtils.isBlank(t)) {
			return StringUtils.EMPTY;
		}
		// init need map
		Map<Character, Integer> needMap = new HashMap<>();
		for (Character ch : t.toCharArray()) {
			needMap.put(ch, needMap.getOrDefault(ch, 0) + 1);
		}
		int leftIdx = 0;
		int rightIdx = 0;
		int match = 0;
		int start = 0;
		int minLen = Integer.MAX_VALUE;
		// window map
		Map<Character, Integer> windowMap = new HashMap<>();
		while (rightIdx < s.length()) {
			char c1 = s.charAt(rightIdx);
			if (needMap.containsKey(c1)) {
				windowMap.put(c1, windowMap.getOrDefault(c1, 0) + 1);
				if (windowMap.get(c1).equals(needMap.get(c1))) {
					match++;
				}
			}
			rightIdx++;
			while (match == needMap.size()) {
				if (rightIdx - leftIdx < minLen) {
					start = leftIdx;
					minLen = rightIdx - leftIdx;
				}
				char c2 = s.charAt(leftIdx);
				if (needMap.containsKey(c2)) {
					windowMap.put(c2, windowMap.get(c2) - 1);
					if (windowMap.get(c2).compareTo(needMap.get(c2)) < 0) {
						match--;
					}
				}
				leftIdx++;
			}
		}
		return minLen == Integer.MAX_VALUE ? StringUtils.EMPTY : s.substring(start, start + minLen);
	}
}
