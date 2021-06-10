package com.leetcode;


import com.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 438. Find All Anagrams in a String
 *
 * @author clx
 */
public class FindAllAnagrams {

	/**
	 * @param source
	 * @param target
	 * @return
	 */
	public static List<Integer> findAllAnagrams(String source, String target) {
		if (StringUtils.isBlank(source) || StringUtils.isBlank(target)) {
			return Collections.emptyList();
		}
		List<Integer> result = new ArrayList<>();
		Map<Character, Integer> needs = initNeeds(target);
		Map<Character, Integer> window = new HashMap<>(target.length());
		int left = 0;
		int right = 0;
		int match = 0;
		while (right < source.length()) {
			char c1 = source.charAt(right);
			if (needs.containsKey(c1)) {
				window.put(c1, window.getOrDefault(c1, 0) + 1);
				if (needs.get(c1).compareTo(window.get(c1)) == 0) {
					match++;
				}
			}
			right++;

			while (match == needs.size()) {
				if ((right - left) == target.length()) {
					result.add(left);
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
		return result;
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
