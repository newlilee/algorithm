package com.leetcode;

import org.junit.Test;

/**
 * @author clx
 */
public class TestImplementStr {

	@Test
	public void test() {
		String haystack = "hello", needle = "ab";
		int result = ImplementStr.strStr(haystack, needle);
		System.out.println("result:" + result);
	}
}
