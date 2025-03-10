package com.leetcode;

import org.testng.annotations.Test;

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
