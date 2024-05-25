package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestMassage {

	@Test
	public void testMassage() {
		// case 1
		int[] caseOne = { 1, 2, 3, 1 };
		System.out.println(Massage.massage(caseOne));
		// case 2
		int[] caseTwo = { 2, 7, 9, 3, 1 };
		System.out.println(Massage.massage(caseTwo));
		// case 3
		int[] caseThree = { 2, 1, 4, 5, 3, 1, 1, 3 };
		System.out.println(Massage.massage(caseThree));
		// case 4
		int[] caseFour = { 0 };
		System.out.println(Massage.massage(caseFour));
	}

	@Test
	public void testMassageEnhance() {
		// case 1
		int[] caseOne = { 1, 2, 3, 1 };
		System.out.println(Massage.massageEnhance(caseOne));
		// case 2
		int[] caseTwo = { 2, 7, 9, 3, 1 };
		System.out.println(Massage.massageEnhance(caseTwo));
		// case 3
		int[] caseThree = { 2, 1, 4, 5, 3, 1, 1, 3 };
		System.out.println(Massage.massageEnhance(caseThree));
	}
}
