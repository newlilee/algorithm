package com.leetcode;

import com.util.StringUtils;

/**
 * 28. Implement strStr()
 *
 * @author clx
 */
public class ImplementStr {

	/**
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public static int strStr(String haystack, String needle) {
		if (StringUtils.isBlank(haystack)) {
			return -1;
		}
		if (StringUtils.isBlank(needle)) {
			return 0;
		}
		int len = needle.length();
		for (int idx = 0; idx < haystack.length(); idx++) {
			int endIdx = idx + len;
			if (endIdx > haystack.length()) {
				return -1;
			}
			if (needle.equals(haystack.substring(idx, endIdx))) {
				return idx;
			}
		}
		return -1;
	}
}
