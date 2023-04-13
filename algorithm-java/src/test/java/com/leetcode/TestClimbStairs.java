package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestClimbStairs {

	@Test
	public void testClimbStairs() {
		// case 1
		System.out.println(ClimbStairs.climbStairs(2));
		// case 2
		System.out.println(ClimbStairs.climbStairs(4));
	}

	@Test
	public void testClimbStairsWithDp() {
		// case 1
		System.out.println(ClimbStairs.climbStairsWithDp(1));
		// case 2
		System.out.println(ClimbStairs.climbStairsWithDp(4));
	}
}
