package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestSearchLetter {

	@Test
	public void testSearchLetter() {
		// case 1
		char[][] caseOne = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String wordOne = "ABCCED";
		System.out.println(SearchLetter.exist(caseOne, wordOne));

		// case 2
		char[][] caseTwo = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String wordTwo = "SEE";
		System.out.println(SearchLetter.exist(caseTwo, wordTwo));

		// case 3
		char[][] caseThree = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
		String wordThree = "ABCB";
		System.out.println(SearchLetter.exist(caseThree, wordThree));
	}
}
