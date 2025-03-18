package com.leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestSearchInsert {

	@Test
	public void testSearchInsert() {
		int[] caseArray = { 1, 3, 5, 6 };

		int targetOne = 5;
		Assert.assertEquals(SearchInsert.searchInsert(caseArray, targetOne), 2);

		int targetTwo = 2;
		Assert.assertEquals(SearchInsert.searchInsert(caseArray, targetTwo), 1);

		int targetThree = 7;
		Assert.assertEquals(SearchInsert.searchInsert(caseArray, targetThree), 4);

		int targetFour = 0;
		Assert.assertEquals(SearchInsert.searchInsert(caseArray, targetFour), 0);
	}
}
