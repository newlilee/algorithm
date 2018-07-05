package com.algorithm.chaptertwo.sort.first;

import org.junit.Test;

import com.algorithm.chaptertwo.sort.first.ShellSort;
import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/4.
 */
public class TestShellSort {

	@Test
	public void testSort() {
		Integer[] array = new Integer[] { -1, 5, 7, 6, 1, 4, 3, 2, 8 };
		System.out.print("before sort:");
		SortUtils.printArray(array);
		ShellSort.sort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}
}
