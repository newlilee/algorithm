package com.algorithm.chaptertwo.sort.second;

import com.algorithm.chaptertwo.sort.util.SortUtils;
import org.junit.jupiter.api.Test;

/**
 * @author clx 2018/7/5.
 */
public class TestMergeSort {

	@Test
	public void testInPlaceSort() {
		Integer[] array = new Integer[]{-1, 5, 7, 6, 1, 4, 3, 2, 8};
		System.out.print("before sort:");
		SortUtils.printArray(array);
		int lo = 0;
		int hi = array.length;
		int mid = (lo + hi) >>> 1;
		MergeSort.inPlaceMergeSort(array, 0, mid, hi);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}

	@Test
	public void testTopDownMergeSort() {
		Integer[] array = new Integer[]{-1, 5, 7, 6, 1, 4, 3, 2, 8};
		System.out.print("before sort:");
		SortUtils.printArray(array);
		MergeSort.topDownMergeSort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}

	@Test
	public void testBottomTopMergeSort() {
		Integer[] array = new Integer[]{-1, 5, 7, 6, 1, 4, 3, 2, 8};
		System.out.print("before sort:");
		SortUtils.printArray(array);
		MergeSort.bottomTopMergeSort(array);
		System.out.print("after sort:");
		SortUtils.printArray(array);
	}
}
