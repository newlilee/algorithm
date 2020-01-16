package com.leetcode;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses
 *
 * @author clx
 */
public class ValidParentheses {

	private static Map<Character, Character> mappings = new HashMap<>();

	static {
		mappings.put('(', ')');
		mappings.put('{', '}');
		mappings.put('[', ']');
	}

	public static boolean isValid(String content) {
		if (StringUtils.isBlank(content)) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for (int idx = 0; idx < content.length(); idx++) {
			char ch = content.charAt(idx);
			if (mappings.containsKey(ch)) {
				char topEle = stack.empty() ? '*' : stack.pop();
				if (topEle != mappings.get(ch)) {
					return false;
				}
			} else {
				stack.push(ch);
			}
		}
		return stack.empty();
	}
}
