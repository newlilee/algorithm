package com.leetcode;

import java.util.Stack;

import com.util.StringUtils;

/**
 * add two string number
 *
 * @author clx
 */
public class AddTwoStringNumber {

	/**
	 * @param first  first string
	 * @param second second string
	 * @return string result
	 */
	public static String addTwoNumber(String first, String second) {
		if (StringUtils.isBlank(first) && StringUtils.isBlank(second)) {
			return StringUtils.EMPTY;
		}
		if (StringUtils.isBlank(first)) {
			return second;
		}
		if (StringUtils.isBlank(second)) {
			return first;
		}
		char[] firstChar;
		char[] secondChar;
		if (first.length() < second.length()) {
			firstChar = second.toCharArray();
			secondChar = first.toCharArray();
		} else {
			firstChar = first.toCharArray();
			secondChar = second.toCharArray();
		}
		int carry = 0;
		int secIdx = secondChar.length - 1;
		Stack<Integer> result = new Stack<>();
		int subResult = 0;
		for (int idx = firstChar.length - 1; idx >= 0; idx--) {
			if (secIdx >= 0) {
				subResult = Character.getNumericValue(firstChar[idx]) + Character.getNumericValue(secondChar[secIdx])
						+ carry;
			} else {
				subResult = Character.getNumericValue(firstChar[idx]) + carry;
			}
			carry = subResult / 10;
			subResult = subResult % 10;
			result.push(subResult);
			secIdx--;
		}
		if (carry > 0) {
			result.push(carry);
		}
		StringBuilder ret = new StringBuilder(32);
		while (!result.isEmpty()) {
			ret.append(result.pop());
		}
		return ret.toString();
	}
}
