package com.leetcode;

import java.util.Map;
import java.util.stream.Collectors;

import com.util.StringUtils;

/**
 * leetcode.409
 *
 * @author clx
 */
public class BuildLongestPalindrome {

	/**
	 * longest palindrome
	 *
	 * @param s string content
	 * @return length
	 */
	public static int longestPalindromeWithStream(String s) {
		Map<Integer, Integer> counter = s.chars().boxed().collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));
		int result = counter.values().stream().mapToInt(i -> i - (i & 1)).sum();
		return result < s.length() ? result + 1 : result;
	}

	/**
	 * longest palindrome
	 *
	 * @param s string content
	 * @return length
	 */
	public static int longestPalindrome(String s) {
		if (StringUtils.isBlank(s)) {
			return 0;
		}
		int[] counter = new int[58];
		for (char ch : s.toCharArray()) {
			counter[ch - 'A']++;
		}
		int result = 0;
		for (int count : counter) {
			result += count - (count & 1);
		}
		return result < s.length() ? result + 1 : result;
	}
}
