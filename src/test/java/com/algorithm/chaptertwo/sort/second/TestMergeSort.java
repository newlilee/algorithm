package com.algorithm.chaptertwo.sort.second;

import org.junit.Test;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/5.
 */
public class TestMergeSort {

	@Test
	public void testSort() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2, 8 };
		System.out.print("before sort:");
		SortUtils.printArray(array);
		MergeSort.sort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}
}
