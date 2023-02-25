package com.leetcode;

import com.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestFindPositionElementSortedArray {

	@Test
	void testFindPosition() {
		// case 1
		int[] caseOne = {5, 7, 7, 8, 8, 10};
		ArrayUtils.printArray(FindPositionElementSortedArray.searchBruteForce(caseOne, 8));
		// case 2
		int[] caseTwo = {5, 7, 7, 8, 8, 10};
		ArrayUtils.printArray(FindPositionElementSortedArray.searchBruteForce(caseTwo, 6));
		// case 3
		int[] caseThree = {};
		ArrayUtils.printArray(FindPositionElementSortedArray.searchBruteForce(caseThree, 0));
	}

	@Test
	void testBinaryFindPosition() {
		// case 1
		int[] caseOne = {5, 7, 7, 8, 8, 10};
		ArrayUtils.printArray(FindPositionElementSortedArray.searchBinary(caseOne, 8));
		// case 2
		int[] caseTwo = {5, 7, 7, 8, 8, 10};
		ArrayUtils.printArray(FindPositionElementSortedArray.searchBinary(caseTwo, 6));
		// case 3
		int[] caseThree = {1};
		ArrayUtils.printArray(FindPositionElementSortedArray.searchBinary(caseThree, 1));
	}
}
