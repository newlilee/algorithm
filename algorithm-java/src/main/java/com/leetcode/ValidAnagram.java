package com.leetcode;

import org.apache.commons.lang3.StringUtils;

/**
 * 242. Valid Anagram
 *
 * @author clx
 */
public class ValidAnagram {

	/**
	 * @param source
	 * @param target
	 * @return
	 */
	public static boolean isAnagram(String source, String target) {
		if (StringUtils.isBlank(source) && StringUtils.isBlank(target)) {
			return true;
		}
		if (StringUtils.isBlank(source)) {
			return false;
		}
		if (StringUtils.isBlank(target)) {
			return false;
		}
		if (source.length() != target.length()) {
			return false;
		}

		int[] count = new int[26];
		for (int i = 0; i < source.length(); i++) {
			count[source.charAt(i) - 'a']++;
			count[target.charAt(i) - 'a']--;
		}
		for (int i : count) {
			if (i != 0) {
				return false;
			}
		}
		return true;
	}
}
