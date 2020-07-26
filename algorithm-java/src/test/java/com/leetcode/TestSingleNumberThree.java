package com.leetcode;

import com.leetcode.util.ArrayUtils;
import org.junit.Test;

/**
 * @author clx
 */
public class TestSingleNumberThree {

	@Test
	public void testSingleNumber() {
		int[] nums = {1, 2, 1, 3, 2, 5};
		int[] result = SingleNumberThree.singleNumber(nums);
		ArrayUtils.printArray(result);
	}
}
