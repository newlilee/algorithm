package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestLongestConsecutive {

	@Test
	public void testLongestConsecutive() {
		// case 1
		int[] caseOne = { 100, 4, 200, 1, 3, 2 };
		System.out.println(LongestConsecutive.longestConsecutive(caseOne));

		// case 2
		int[] caseTwo = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(LongestConsecutive.longestConsecutive(caseTwo));
	}
}
