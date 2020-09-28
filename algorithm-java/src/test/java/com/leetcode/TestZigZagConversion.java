package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestZigZagConversion {

	@Test
	public void testZigZagConversion() {
		String content = "PAYPALISHIRING";
		int numRows = 3;
		String result = ZigZagConversion.convert(content, numRows);
		System.out.println(result);
	}
}
