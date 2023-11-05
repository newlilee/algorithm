package com.leetcode;

import java.util.ArrayList;
import java.util.List;

import com.util.StringUtils;

/**
 * leetcode 6.ZigZag Conversion
 *
 * @author clx
 */
public class ZigZagConversion {

	/**
	 * convert
	 *
	 * @param content
	 * @param numRows
	 * @return
	 */
	public static String convert(String content, int numRows) {
		if (StringUtils.isBlank(content)) {
			return StringUtils.EMPTY;
		}
		if (numRows <= 1) {
			return content;
		}
		List<StringBuilder> rows = new ArrayList<>();
		int min = Math.min(content.length(), numRows);
		for (int idx = 0; idx < min; idx++) {
			rows.add(new StringBuilder());
		}

		int currRow = 0;
		boolean goingDown = false;
		for (char ch : content.toCharArray()) {
			rows.get(currRow).append(ch);
			if (currRow == 0 || currRow == numRows - 1) {
				goingDown = !goingDown;
			}
			currRow += goingDown ? 1 : -1;
		}
		StringBuilder result = new StringBuilder();
		rows.forEach(result::append);
		return result.toString();
	}
}
