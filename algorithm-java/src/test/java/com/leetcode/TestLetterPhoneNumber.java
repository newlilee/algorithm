package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

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
