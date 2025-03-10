package com.algorithm.chaptertwo.sort.third;

import org.testng.annotations.Test;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2/17/2018
 */
public class TestQuickSort {

	@Test
	public void testQuickSort() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2, 8 };
		System.out.print("before sort:");
		SortUtils.printArray(array);
		QuickSort.sort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}
}
