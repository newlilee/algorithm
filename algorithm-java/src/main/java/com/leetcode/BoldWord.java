package com.leetcode;

import java.util.Arrays;
import java.util.List;

import com.util.StringUtils;

/**
 * leetcode.616
 *
 * @author clx
 */
public class BoldWord {

	/**
	 * bold word with bool array
	 *
	 * @param s     origin string
	 * @param words key word
	 * @return bolded string
	 */
	public static String boldWord(String s, List<String> words) {
		if (StringUtils.isBlank(s) || words == null || words.isEmpty()) {
			return s;
		}
		int len = s.length();
		// 标记word在字符串s中出现的位置
		boolean[] marked = new boolean[len];
		words.forEach(word -> {
			int wordLen = word.length();
			for (int idx = 0; idx <= len - wordLen; idx++) {
				if (s.startsWith(word, idx)) {
					Arrays.fill(marked, idx, idx + wordLen, true);
				}
			}
		});

		int idx = 0;
		StringBuilder builder = new StringBuilder();
		while (idx < marked.length) {
			if (marked[idx]) {
				builder.append("<b>");
				while (idx < marked.length && marked[idx]) {
					builder.append(s.charAt(idx++));
				}
				builder.append("</b>");
			} else {
				builder.append(s.charAt(idx++));
			}
		}
		return builder.toString();
	}
}
