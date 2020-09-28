package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMinimumWindowSubstring {

	@Test
	public void testMinimumWindowSubstring() {
		String source = "ADOBECODEBANC";
		String target = "ABC";
		String result = MinimumWindowSubstring.minWindow(source, target);
		System.out.println("result:" + result);
	}
}
