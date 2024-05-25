package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestFullArrangement {

	@Test
	public void testFullArrangement() {
		// case 1
		int[] caseOne = { 1, 2, 3 };
		System.out.println(FullArrangement.arrangement(caseOne));
		// case 2
		int[] caseTwo = { 1 };
		System.out.println(FullArrangement.arrangement(caseTwo));
	}
}
