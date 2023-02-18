package com.leetcode;


import com.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. Letter Combinations of a Phone Number
 *
 * @author clx
 */
public class LetterPhoneNumber {

	static Map<String, String> phoneKeyboard = new HashMap<>();

	static {
		phoneKeyboard.put("2", "abc");
		phoneKeyboard.put("3", "def");
		phoneKeyboard.put("4", "ghi");
		phoneKeyboard.put("5", "jkl");
		phoneKeyboard.put("6", "mno");
		phoneKeyboard.put("7", "pqrs");
		phoneKeyboard.put("8", "tuv");
		phoneKeyboard.put("9", "wxyz");
	}

	/**
	 * @param digits
	 * @return
	 */
	public static List<String> letterCombinations(String digits) {
		if (StringUtils.isBlank(digits)) {
			return Collections.emptyList();
		}
		List<String> result = new ArrayList<>();
		combination(result, "", digits);
		return result;
	}

	private static void combination(List<String> result, String currStr, String digits) {
		if (StringUtils.isBlank(digits)) {
			result.add(currStr);
		} else {
			String digit = digits.substring(0, 1);
			String letters = phoneKeyboard.get(digit);
			for (int idx = 0; idx < letters.length(); idx++) {
				String letter = letters.substring(idx, idx + 1);
				combination(result, currStr + letter, digits.substring(1));
			}
		}
	}
}
