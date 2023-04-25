package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMinimumWindowSubstring {

	@Test
	public void testMinimumWindowSubstring() {
		// case 1
		System.out.println(MinimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
		// case 2
		System.out.println(MinimumWindowSubstring.minWindow("a", "a"));
		// case 3
		System.out.println(MinimumWindowSubstring.minWindow("a", "aa"));
	}
}
