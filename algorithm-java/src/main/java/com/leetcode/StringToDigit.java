package com.leetcode;

import com.util.StringUtils;

/**
 * leetcode 8.atoi
 *
 * @author clx
 */
public class StringToDigit {

	/**
	 * atoi
	 *
	 * @param content
	 */
	public static int atoi(String content) {
		if (StringUtils.isBlank(content)) {
			return 0;
		}

		int len = content.length();
		for (int idx = 0; idx < len; idx++) {
			char ch = content.charAt(idx);
			if (ch == ' ') {
				continue;
			}
		}
		return 0;
	}
}
