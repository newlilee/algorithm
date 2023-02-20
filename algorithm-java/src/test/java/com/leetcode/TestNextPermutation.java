package com.leetcode;

import com.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestNextPermutation {

	@Test
	void testNextPermutation() {
		// case 1
		int[] caseOne = {1, 2, 3};
		NextPermutation.nextPermutation(caseOne);
		ArrayUtils.printArray(caseOne);
		// case 2
		int[] caseTwo = {3, 2, 1};
		NextPermutation.nextPermutation(caseTwo);
		ArrayUtils.printArray(caseTwo);
		// case 3
		int[] caseThree = {1, 1, 5};
		NextPermutation.nextPermutation(caseThree);
		ArrayUtils.printArray(caseThree);
	}
}
