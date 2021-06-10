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

	private static Map<String, String> phoneKeyboard = new HashMap<String, String>() {{
		put("2", "abc");
		put("3", "def");
		put("4", "ghi");
		put("5", "jkl");
		put("6", "mno");
		put("7", "pqrs");
		put("8", "tuv");
		put("9", "wxyz");
	}};

	private static List<String> result = new ArrayList<>();

	/**
	 * @param digits
	 * @return
	 */
	public static List<String> letterCombinations(String digits) {
		if (StringUtils.isBlank(digits)) {
			return Collections.emptyList();
		}
		combination("", digits);
		return result;
	}

	private static void combination(String currStr, String digits) {
		if (StringUtils.isBlank(digits)) {
			result.add(currStr);
		} else {
			String digit = digits.substring(0, 1);
			String letters = phoneKeyboard.get(digit);
			for (int idx = 0; idx < letters.length(); idx++) {
				String letter = letters.substring(idx, idx + 1);
				combination(currStr + letter, digits.substring(1));
			}
		}
	}
}
