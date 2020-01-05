package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestStringToDigit {

	@Test
	public void testAtoi() {
		String content = "4193 abc";
		int result = StringToDigit.atoi(content);
		System.out.println(result);
	}
}
