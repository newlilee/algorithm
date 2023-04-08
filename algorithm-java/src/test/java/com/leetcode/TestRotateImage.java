package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author clx
 */
public class TestRotateImage {

	@Test
	public void testRevolveImage() {
		// case 1
		int[][] caseOne = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		RotateImage.rotateImage(caseOne);
		System.out.println(Arrays.deepToString(caseOne));
		// case 2
		int[][] caseTwo = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
		RotateImage.rotateImage(caseTwo);
		System.out.println(Arrays.deepToString(caseTwo));
	}
}
