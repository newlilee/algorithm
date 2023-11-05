package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses 数字n代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且有效的括号组合。
 *
 * @author clx
 */
public class GenerateParentheses {

	/**
	 * @param num parenthesis num
	 * @return parenthesis string
	 */
	public static List<String> generateParentheses(int num) {
		if (num <= 0) {
			return new ArrayList<>();
		}
		List<String> result = new ArrayList<>();
		dfs(result, "", 0, 0, num);
		return result;
	}

	private static void dfs(List<String> result, String currString, int open, int close, int num) {
		if (currString.length() == 2 * num) {
			result.add(currString);
			return;
		}
		if (open < num) {
			dfs(result, currString + "(", open + 1, close, num);
		}
		if (close < open) {
			dfs(result, currString + ")", open, close + 1, num);
		}
	}
}
