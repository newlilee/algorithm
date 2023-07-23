package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author clx
 */
public class TestInsertSection {

	@Test
	public void testInsertSection() {
		// case 1
		int[][] caseOne = {{1, 3}, {6, 9}};
		int[] newCaseOne = {2, 5};
		System.out.println(Arrays.deepToString(InsertSection.insertSection(caseOne, newCaseOne)));

		// case 2
		int[][] caseTwo = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
		int[] newCaseTwo = {4, 8};
		System.out.println(Arrays.deepToString(InsertSection.insertSection(caseTwo, newCaseTwo)));

		// case 3
		int[][] caseThree = {};
		int[] newCaseThree = {5, 7};
		System.out.println(Arrays.deepToString(InsertSection.insertSection(caseThree, newCaseThree)));
		// case 4
		int[][] caseFour = {{1, 5}};
		int[] newCaseFour = {2, 3};
		System.out.println(Arrays.deepToString(InsertSection.insertSection(caseFour, newCaseFour)));

		// case 5
		int[][] caseFive = {{1, 5}};
		int[] newCaseFive = {2, 7};
		System.out.println(Arrays.deepToString(InsertSection.insertSection(caseFive, newCaseFive)));
	}
}
