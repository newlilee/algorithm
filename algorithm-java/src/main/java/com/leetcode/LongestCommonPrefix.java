package com.leetcode;

import com.util.StringUtils;

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

	/**
	 * @param contents
	 * @return
	 */
	public static String longestCommonPrefix(String[] contents) {
		if (contents == null || contents.length == 0) {
			return StringUtils.EMPTY;
		}
		return longestCommonPrefix(contents, 0, contents.length - 1);
	}

	private static String longestCommonPrefix(String[] contents, int low, int high) {
		if (low == high) {
			return contents[low];
		} else {
			int mid = (low + high) >>> 1;
			String commonLeft = longestCommonPrefix(contents, low, mid);
			String commonRight = longestCommonPrefix(contents, mid + 1, high);
			return commonPrefix(commonLeft, commonRight);
		}
	}

	private static String commonPrefix(String left, String right) {
		int min = Math.min(left.length(), right.length());
		for (int idx = 0; idx < min; idx++) {
			if (left.charAt(idx) != right.charAt(idx)) {
				return left.substring(0, idx);
			}
		}
		return left.substring(0, min);
	}
}
