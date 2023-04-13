package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestMinDistance {

	@Test
	public void testMinDistance() {
		// case 1
		String caseOneWordOne = "horse";
		String caseOneWordTwo = "ros";
		System.out.println(MinDistance.minDistance(caseOneWordOne, caseOneWordTwo));
		// case 2
		String caseTwoWordOne = "intention";
		String caseTwoWordTwo = "execution";
		System.out.println(MinDistance.minDistance(caseTwoWordOne, caseTwoWordTwo));
	}
}
