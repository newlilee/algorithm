package com.leetcode;

import com.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * leetcode 17
 * 给定一个仅包含数字2-9的字符串，返回所有它能表示的字母组合。答案可以按任意顺序返回。
 * <p>
 * 给出数字到字母的映射如下（与电话按键相同）。注意1不对应任何字母。
 *
 * @author clx
 */
public class LetterCombination {

	static Map<Character, String> numLetterMap = new HashMap<>();

	static {
		numLetterMap.put('2', "abc");
		numLetterMap.put('3', "def");
		numLetterMap.put('4', "ghi");
		numLetterMap.put('5', "jkl");
		numLetterMap.put('6', "mno");
		numLetterMap.put('7', "pqrs");
		numLetterMap.put('8', "tuv");
		numLetterMap.put('9', "wxyz");
	}

	/**
	 * dfs
	 *
	 * @param digits digits
	 * @return letter
	 */
	public static List<String> phoneCombinationDfs(String digits) {
		if (StringUtils.isBlank(digits)) {
			return new ArrayList<>();
		}
		List<String> letterResult = new ArrayList<>();
		LetterCombination.dfs(letterResult, digits, 0, new StringBuilder());
		return letterResult;
	}

	private static void dfs(List<String> letterResult, String digits, int idx, StringBuilder builder) {
		if (idx == digits.length()) {
			letterResult.add(builder.toString());
		} else {
			char digit = digits.charAt(idx);
			String letters = numLetterMap.get(digit);
			for (int jdx = 0; jdx < letters.length(); jdx++) {
				builder.append(letters.charAt(jdx));
				dfs(letterResult, digits, idx + 1, builder);
				builder.deleteCharAt(idx);
			}
		}
	}

	/**
	 * bfs
	 *
	 * @param digits digits
	 * @return letter
	 */
	public static List<String> phoneCombinationWithBfs(String digits) {
		if (StringUtils.isBlank(digits)) {
			return new ArrayList<>();
		}
		List<String> letterResult = new ArrayList<>();
		bfs(letterResult, digits);
		return letterResult;
	}

	private static void bfs(List<String> letterResult, String digits) {
		Queue<String> numLetter = new LinkedList<>();
		for (int idx = 0; idx < digits.length(); idx++) {
			numLetter.offer(numLetterMap.get(digits.charAt(idx)));
		}
		Queue<String> subList = new LinkedList<>();
		while (!numLetter.isEmpty()) {
			String letters = numLetter.poll();
			if (subList.isEmpty()) {
				for (int idx = 0; idx < letters.length(); idx++) {
					subList.offer(String.valueOf(letters.charAt(idx)));
				}
			} else {
				int len = subList.size();
				for (int idx = 0; idx < len; idx++) {
					String preString = subList.poll();
					for (int jdx = 0; jdx < letters.length(); jdx++) {
						subList.offer(preString + letters.charAt(jdx));
					}
				}
			}
		}
		letterResult.addAll(subList);
	}
}
