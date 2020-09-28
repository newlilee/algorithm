package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestFindAllAnagrams {

	@Test
	public void testFindAllAnagrams() {
		String source = "cbaebabacd";
		String target = "abc";
		List<Integer> result = FindAllAnagrams.findAllAnagrams(source, target);
		System.out.println("result:" + result);
	}
}
