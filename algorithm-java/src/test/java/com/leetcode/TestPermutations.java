package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestPermutations {

	@Test
	public void testPermutation() {
		// case 1
		int[] caseOne = new int[]{1, 2, 3};
		System.out.println(Permutations.permutations(caseOne));

		// case 2
		int[] caseTwo = new int[]{0, 1};
		System.out.println(Permutations.permutations(caseTwo));

		// case 3
		int[] caseThree = new int[]{1};
		System.out.println(Permutations.permutations(caseThree));
	}
}
