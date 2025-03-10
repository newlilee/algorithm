package com.algorithm.chaptertwo.sort.util;

/**
 * @author clx 9/20/2018.
 */
public class TestSortUtils {

	public static void main(String[] args) {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2 };
		System.out.print("before sort:");
		SortUtils.printArray(array);
		System.out.println(SortUtils.isSorted(array));
	}
}
