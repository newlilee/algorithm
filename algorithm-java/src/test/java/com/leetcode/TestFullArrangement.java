package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author clx
 */
public class TestFullArrangement {

	@Test
	public void testFullArrangement() {
		int[] nums = {1, 2, 3};
		List<List<Integer>> result = FullArrangement.arrangement(nums);
		System.out.println(result);
	}
}
