package com.leetcode;


import com.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * leetcode.20. Valid Parentheses
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串s，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 *
 * @author clx
 */
public class ValidParentheses {

	static Map<Character, Character> mappings = new HashMap<>();

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
		for (char ch : content.toCharArray()) {
			if (mappings.containsKey(ch)) {
				stack.push(ch);
			} else {
				if (stack.empty() || mappings.get(stack.peek()) != ch) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.empty();
	}
}
