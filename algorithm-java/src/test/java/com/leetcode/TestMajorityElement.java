package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMajorityElement {

	@Test
	public void testMajorityElement() {
		// case 1 ->3
		int[] caseOne = {3, 2, 3};
		System.out.println(MajorityElement.majorityElement(caseOne));

		// case 2 ->2
		int[] caseTwo = {2, 2, 1, 1, 1, 2, 2};
		System.out.println(MajorityElement.majorityElement(caseTwo));
	}
}
