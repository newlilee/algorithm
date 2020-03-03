package com.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 131. Palindrome Partitioning
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p>
 * Return all possible palindrome partitioning of s.
 *
 * @author clx
 */
public class PalindromePartitioning {

	/**
	 * @param content
	 * @return
	 */
	public static List<List<String>> palindrome(String content) {
		if (StringUtils.isBlank(content)) {
			return Collections.emptyList();
		}
		List<List<String>> result = new ArrayList<>();
		backtracking(result, content, new ArrayList<>(), 0);
		return result;
	}

	private static void backtracking(List<List<String>> result, String content, List<String> list, int startIdx) {
		if (startIdx == content.length()) {
			result.add(new ArrayList<>(list));
		} else {
			for (int idx = startIdx; idx < content.length(); idx++) {
				if (isPalindrome(content, startIdx, idx)) {
					list.add(content.substring(startIdx, idx + 1));
					backtracking(result, content, list, idx + 1);
					list.remove(list.size() - 1);
				}
			}
		}
	}

	/**
	 * verify palindrome
	 *
	 * @param content
	 * @param low
	 * @param high
	 * @return
	 */
	private static boolean isPalindrome(String content, int low, int high) {
		while (low < high) {
			if (content.charAt(low++) != content.charAt(high--)) {
				return false;
			}
		}
		return true;
	}
}
