package com.algorithm.chaptertwo.sort.first;

import org.junit.Test;

import com.algorithm.chaptertwo.sort.first.InsertionSort;
import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/3.
 */
public class TestInsertionSort {

	@Test
	public void testSort() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2 };
		System.out.print("before sort:");
		SortUtils.printArray(array);
		InsertionSort.sort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}

	@Test
	public void testInsertionSortEnhance() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2 };
		System.out.print("before sort:");
		SortUtils.printArray(array);
		InsertionSort.sortEnhance(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}
}
