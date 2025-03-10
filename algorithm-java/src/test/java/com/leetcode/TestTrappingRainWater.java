package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestTrappingRainWater {

	@Test
	public void testTrappingBruteForce() {
		// case 1
		int[] caseOne = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("result:" + TrappingRainWater.trapBruteForce(caseOne));
		// case 2
		int[] caseTwo = new int[] { 4, 2, 0, 3, 2, 5 };
		System.out.println("result:" + TrappingRainWater.trapBruteForce(caseTwo));
	}

	@Test
	public void testTrapping() {
		// case 1
		int[] caseOne = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("result:" + TrappingRainWater.trapWithDoublePointer(caseOne));
		// case 2
		int[] caseTwo = new int[] { 4, 2, 0, 3, 2, 5 };
		System.out.println("result:" + TrappingRainWater.trapWithDoublePointer(caseTwo));
	}

	@Test
	public void testTrapStack() {
		// case 1
		int[] caseOne = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("result:" + TrappingRainWater.trapStack(caseOne));
		// case 2
		int[] caseTwo = new int[] { 4, 2, 0, 3, 2, 5 };
		System.out.println("result:" + TrappingRainWater.trapStack(caseTwo));
	}

	@Test
	public void testTrapDynamicPrograming() {
		// case 1
		int[] caseOne = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println("result:" + TrappingRainWater.trapDynamicPrograming(caseOne));
		// case 2
		int[] caseTwo = new int[] { 4, 2, 0, 3, 2, 5 };
		System.out.println("result:" + TrappingRainWater.trapDynamicPrograming(caseTwo));
	}
}
