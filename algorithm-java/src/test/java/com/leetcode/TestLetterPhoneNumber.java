package com.leetcode;

import java.util.List;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestLetterPhoneNumber {

	@Test
	void testLetterCombinations() {
		String content = "23456789";
		List<String> result = LetterPhoneNumber.letterCombinations(content);
		System.out.println(result);
	}
}
