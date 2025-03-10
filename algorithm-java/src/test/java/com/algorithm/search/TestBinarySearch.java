package com.algorithm.search;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestBinarySearch {

	@Test
	public void testBinarySearch() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 3;
		int result = BinarySearch.binarySearch(array, key);
		System.out.println("result:" + result);
	}

	@Test
	public void testRank() {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 3;
		int result = BinarySearch.rank(key, array, 0, array.length);
		System.out.println("result:" + result);
	}

	@Test
	public void testLeftBound() {
		int[] array = new int[] { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 4;
		int result = BinarySearch.leftBound(array, key);
		System.out.println("result:" + result);
	}

	@Test
	public void testRightBound() {
		int[] array = new int[] { 1, 2, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 4;
		int result = BinarySearch.rightBound(array, key);
		System.out.println("result:" + result);
	}
}
