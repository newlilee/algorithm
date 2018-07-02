package com.algorithm.chaptertwo.sort;

import org.junit.Test;

import com.algorithm.chaptertwo.sort.first.SelectionSort;
import com.algorithm.chaptertwo.sort.util.ExampleUtils;

/**
 * @author clx 2018/7/2.
 */
public class TestSelectionSort {

	@Test
	public void testSort() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2 };
		System.out.print("before sort:");
		ExampleUtils.printArray(array);
		SelectionSort.sort(array);
		System.out.print("after sort:");
		ExampleUtils.printArray(array);
	}
}
