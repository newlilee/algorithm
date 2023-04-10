package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestJumpGame {

	@Test
	public void testCanJump() {
		// case 1
		int[] caseOne = {2, 3, 1, 1, 4};
		System.out.println(JumpGame.canJump(caseOne));
		// case 2
		int[] caseTwo = {3, 2, 1, 0, 4};
		System.out.println(JumpGame.canJump(caseTwo));
	}
}
