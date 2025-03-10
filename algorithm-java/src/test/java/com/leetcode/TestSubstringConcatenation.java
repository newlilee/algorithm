package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestSubstringConcatenation {

	@Test
	public void test() {
		String content = "barfoothefoobarman";
		String[] words = new String[] { "foo", "bar" };
		List<Integer> result = SubstringConcatenation.findSubstring(content, words);
		System.out.println("result:" + result);
	}
}
