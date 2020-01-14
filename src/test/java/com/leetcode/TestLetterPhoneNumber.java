package com.leetcode;

import org.junit.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestLetterPhoneNumber {

	@Test
	public void testLetterCombinations() {
		String content = "23456789";
		List<String> result = LetterPhoneNumber.letterCombinations(content);
		System.out.println(result);
	}
}
