package com.leetcode;

import org.testng.annotations.Test;

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
