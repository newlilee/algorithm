package com.leetcode;

import com.leetcode.util.ArrayUtils;
import org.junit.Test;

/**
 * @author clx
 */
public class TestNextPermutation {

	@Test
	public void testNextPermutation() {
		int[] array = new int[]{1, 2, 3};
		ArrayUtils.printArray(array);
		NextPermutation.nextPermutation(array);
		ArrayUtils.printArray(array);
	}
}
