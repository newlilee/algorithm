package com.algorithm.chaptertwo.sort.third;

import org.junit.Test;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2/20/2018
 */
public class TestQuickSortThreeWay {

	@Test
	public void test3Way() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2, 8 };
		System.out.print("before sort:");
		SortUtils.printArray(array);
		QuickSortThreeWay.sort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}
}
