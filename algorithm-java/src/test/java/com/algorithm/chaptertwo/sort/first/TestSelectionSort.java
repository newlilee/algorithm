package com.algorithm.chaptertwo.sort.first;

import com.algorithm.chaptertwo.sort.util.SortUtils;
import org.junit.jupiter.api.Test;

/**
 * @author clx 2018/7/2.
 */
public class TestSelectionSort {

	@Test
	public void testSort() {
		Integer[] array = new Integer[]{-1, 5, 7, 6, 1, 4, 3, 2};
		System.out.print("before sort:");
		SortUtils.printArray(array);
		SelectionSort.sort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}
}
