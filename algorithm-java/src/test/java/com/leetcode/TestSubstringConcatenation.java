package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestSubstringConcatenation {

	@Test
	public void test() {
		String content = "barfoothefoobarman";
		String[] words = new String[]{"foo", "bar"};
		List<Integer> result = SubstringConcatenation.findSubstring(content, words);
		System.out.println("result:" + result);
	}
}
