package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

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
