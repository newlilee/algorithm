package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestLetterCombination {

	@Test
	void testPhoneCombinationDfs() {
		// case 1
		String caseOne = "273";
		System.out.println(LetterCombination.phoneCombinationDfs(caseOne));
		// case 2
		String caseTwo = "";
		System.out.println(LetterCombination.phoneCombinationDfs(caseTwo));
		// case 3
		String caseThree = "2";
		System.out.println(LetterCombination.phoneCombinationDfs(caseThree));
	}

	@Test
	void testPhoneCombinationBfs() {
		// case 1
		String caseOne = "273";
		System.out.println(LetterCombination.phoneCombinationWithBfs(caseOne));
		// case 2
		String caseTwo = "";
		System.out.println(LetterCombination.phoneCombinationWithBfs(caseTwo));
		// case 3
		String caseThree = "2";
		System.out.println(LetterCombination.phoneCombinationWithBfs(caseThree));
	}
}
