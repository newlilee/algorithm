package com.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

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
		List<String> wordsTwo = Collections.emptyList();
		System.out.println("caseTwo:" + BoldWord.boldWord(caseTwo, wordsTwo));

		// case 3
		String caseThree = "abcdf";
		List<String> wordsThree = Collections.emptyList();
		System.out.println("caseThree:" + BoldWord.boldWord(caseThree, wordsThree));
	}
}
