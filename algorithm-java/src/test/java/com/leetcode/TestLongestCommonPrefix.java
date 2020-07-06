package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestLongestCommonPrefix {

	@Test
	public void test() {
		String[] contents = new String[]{"flower", "flow", "flight"};
		String result = LongestCommonPrefix.longestCommonPrefixBruteForce(contents);
		System.out.println(result);
	}

	@Test
	public void testLongestCommonPrefix() {
		String[] contents = new String[]{"flower", "flow", "flight"};
		String result = LongestCommonPrefix.longestCommonPrefix(contents);
		System.out.println(result);
	}
}
