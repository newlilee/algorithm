package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestSearchRotatedSortedArray {

	@Test
	void testSearchArray() {
		// case 1
		int[] caseOne = {4, 5, 6, 7, 0, 1, 2};
		System.out.println(SearchRotatedSortedArray.search(caseOne, 0));
		// case 2
		int[] caseTwo = {4, 5, 6, 7, 0, 1, 2};
		System.out.println(SearchRotatedSortedArray.search(caseTwo, 3));
		// case 3
		int[] caseThree = {1};
		System.out.println(SearchRotatedSortedArray.search(caseThree, 0));
	}
}
