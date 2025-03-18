package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestFindMiddleIndex {

	@Test
	public void testFindMiddleIndex() {
		int[] caseOne = { 1, 7, 3, 6, 5, 6 };
		Assert.assertEquals(FindMiddleIndex.findMiddleIndex(caseOne), 3);

		int[] caseTwo = { 1, 2, 3 };
		Assert.assertEquals(FindMiddleIndex.findMiddleIndex(caseTwo), -1);

		int[] caseThree = { 2, 1, -1 };
		Assert.assertEquals(FindMiddleIndex.findMiddleIndex(caseThree), 0);
	}
}
