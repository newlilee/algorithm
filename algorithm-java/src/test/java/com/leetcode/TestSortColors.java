package com.leetcode;

import java.util.Arrays;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestSortColors {

	@Test
	public void testSortColors() {
		// case 1
		int[] caseOne = { 2, 0, 2, 1, 1, 0 };
		SortColors.sortColors(caseOne);
		System.out.println(Arrays.toString(caseOne));
		// case 2
		int[] caseTwo = { 2, 0, 1 };
		SortColors.sortColors(caseTwo);
		System.out.println(Arrays.toString(caseTwo));
	}

	@Test
	public void testSortColorsWithDoublePointer() {
		// case 1
		int[] caseOne = { 2, 0, 2, 1, 1, 0 };
		SortColors.sortColorsWithDoublePointer(caseOne);
		System.out.println(Arrays.toString(caseOne));
		// case 2
		int[] caseTwo = { 2, 0, 1 };
		SortColors.sortColorsWithDoublePointer(caseTwo);
		System.out.println(Arrays.toString(caseTwo));
	}
}
