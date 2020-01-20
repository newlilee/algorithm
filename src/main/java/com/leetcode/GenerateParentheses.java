package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 22. Generate Parentheses
 *
 * @author clx
 */
public class GenerateParentheses {

	/**
	 * @param num
	 * @return
	 */
	public static List<String> generateParentheses(int num) {
		if (num <= 0) {
			return Collections.emptyList();
		}
		List<String> result = new ArrayList<>();
		backtrack(result, "", 0, 0, num);
		return result;
	}

	public static void backtrack(List<String> result, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			result.add(cur);
			return;
		}
		if (open < max) {
			backtrack(result, cur + "(", open + 1, close, max);
		}
		if (close < open) {
			backtrack(result, cur + ")", open, close + 1, max);
		}
	}
}
