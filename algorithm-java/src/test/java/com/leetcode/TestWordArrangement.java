package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestWordArrangement {

	@Test
	public void testWordArrangement() {
		// case 1
		String[] caseOne = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(WordArrangement.wordArrangement(caseOne));
		// case 2
		String[] caseTwo = {""};
		System.out.println(WordArrangement.wordArrangement(caseTwo));
		// case 3
		String[] caseThree = {"a"};
		System.out.println(WordArrangement.wordArrangement(caseThree));
	}
}
