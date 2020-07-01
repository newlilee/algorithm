package com.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring
 *
 * @author clx
 */
public class MinimumWindowSubstring {

	/**
	 * @param source
	 * @param target
	 * @return
	 */
	public static String minWindow(String source, String target) {
		if (StringUtils.isBlank(source) || StringUtils.isBlank(target)) {
			return StringUtils.EMPTY;
		}
		Map<Character, Integer> needs = initNeeds(target);
		Map<Character, Integer> window = new HashMap<>();
		int left = 0;
		int right = 0;
		int match = 0;
		int start = 0;
		int minLen = Integer.MAX_VALUE;
		while (right < source.length()) {
			char c1 = source.charAt(right);
			if (needs.containsKey(c1)) {
				window.put(c1, window.getOrDefault(c1, 0) + 1);
				if (window.get(c1).equals(needs.get(c1))) {
					match++;
				}
			}
			right++;

			while (match == needs.size()) {
				if (right - left < minLen) {
					start = left;
					minLen = right - left;
				}
				char c2 = source.charAt(left);
				if (needs.containsKey(c2)) {
					window.put(c2, window.get(c2) - 1);
					if (window.get(c2).compareTo(needs.get(c2)) < 0) {
						match--;
					}
				}
				left++;
			}
		}
		return minLen == Integer.MAX_VALUE ? StringUtils.EMPTY : source.substring(start, start + minLen);
	}

	/**
	 * init needs map
	 *
	 * @param target
	 * @return
	 */
	private static Map<Character, Integer> initNeeds(String target) {
		Map<Character, Integer> needs = new HashMap<>(target.length());
		for (char ch : target.toCharArray()) {
			needs.put(ch, needs.getOrDefault(ch, 0) + 1);
		}
		return needs;
	}
}
