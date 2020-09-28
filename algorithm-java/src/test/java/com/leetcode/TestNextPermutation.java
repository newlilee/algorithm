package com.leetcode;

import com.leetcode.util.ArrayUtils;
import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestNextPermutation {

	@Test
	public void testNextPermutation() {
		int[] array = new int[]{1, 5, 8, 4, 7, 6, 5, 3, 1};
		ArrayUtils.printArray(array);
		NextPermutation.nextPermutation(array);
		ArrayUtils.printArray(array);
	}
}
