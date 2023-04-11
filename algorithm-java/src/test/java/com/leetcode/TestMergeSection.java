package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author clx
 */
public class TestMergeSection {

	@Test
	public void testMergeSection() {
		// case 1
		int[][] caseOne = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
		System.out.println(Arrays.deepToString(MergeSection.mergeSection(caseOne)));
		// case 2
		int[][] caseTwo = {{1, 4}, {4, 5}};
		System.out.println(Arrays.deepToString(MergeSection.mergeSection(caseTwo)));
	}
}
