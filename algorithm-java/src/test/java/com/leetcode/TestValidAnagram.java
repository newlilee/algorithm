package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestValidAnagram {

	@Test
	public void testAnagram() {
//		String source = "anagram";
//		String source = "art";
//		String source = "";
		String source = "a";
//		String source = "yqhbicoumu";
//		String target = "car";
//		String target = "";
		String target = "ab";
//		String target = "ouiuycbmqh";
//		String target = "nagaram";
		boolean result = ValidAnagram.isAnagram(source, target);
		System.out.println("result:" + result);
	}
}
