package com.algorithm.chaptertwo.sort;

import org.junit.Test;

import com.algorithm.chaptertwo.sort.first.InsertionSort;
import com.algorithm.chaptertwo.sort.util.ExampleUtils;

/**
 * @author clx 2018/7/3.
 */
public class TestInsertionSort {

	@Test
	public void testSort() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2 };
		System.out.print("before sort:");
		ExampleUtils.printArray(array);
		InsertionSort.sort(array);
		System.out.print("after sort:");
		ExampleUtils.printArray(array);
	}

	@Test
	public void testInsertionSortEnhance() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2 };
		System.out.print("before sort:");
		ExampleUtils.printArray(array);
		InsertionSort.sortEnhance(array);
		System.out.print("after sort:");
		ExampleUtils.printArray(array);
	}
}
