package com.leetcode;

import org.apache.commons.lang3.StringUtils;

/**
 * 14. Longest Common Prefix
 *
 * @author clx
 */
public class LongestCommonPrefix {

	/**
	 * brute force
	 *
	 * @param contents
	 * @return
	 */
	public static String longestCommonPrefixBruteForce(String[] contents) {
		if (contents == null || contents.length == 0) {
			return StringUtils.EMPTY;
		}
		String prefix = contents[0];
		for (int idx = 1; idx < contents.length; idx++) {
			while (contents[idx].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return StringUtils.EMPTY;
				}
			}
		}
		return prefix;
	}
}
