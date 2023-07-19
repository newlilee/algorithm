package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author clx
 */
public class TestBoldWord {

	@Test
	void testBoldWord() {
		// case 1
		String caseOne = "abcdf";
		List<String> wordsOne = Arrays.asList("a", "ab", "bc", "f");
		System.out.println("caseOne:" + BoldWord.boldWord(caseOne, wordsOne));

		// case 2
		String caseTwo = "";
		List<String> wordsTwo = Arrays.asList();
		System.out.println("caseTwo:" + BoldWord.boldWord(caseTwo, wordsTwo));

		// case 3
		String caseThree = "abcdf";
		List<String> wordsThree = Arrays.asList();
		System.out.println("caseThree:" + BoldWord.boldWord(caseThree, wordsThree));
	}
}
