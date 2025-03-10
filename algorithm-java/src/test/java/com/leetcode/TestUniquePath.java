package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestUniquePath {

	@Test
	public void testUniquePath() {
		// case 1
		System.out.println(UniquePath.uniquePath(3, 7));
		// case 2
		System.out.println(UniquePath.uniquePath(3, 2));
		// case 3
		System.out.println(UniquePath.uniquePath(7, 3));
		// case 4
		System.out.println(UniquePath.uniquePath(3, 3));
	}
}
