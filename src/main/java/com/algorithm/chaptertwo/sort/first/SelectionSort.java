package com.algorithm.chaptertwo.sort.first;

import com.algorithm.chaptertwo.sort.util.ExampleUtils;

/**
 * @author clx 2018/7/2.
 */
public class SelectionSort {

	/**
	 * selection sort
	 * 
	 * @param array
	 */
	public static void sort(Comparable[] array) {
		if (array == null) {
			return;
		}
		if (array.length == 0) {
			return;
		}
		int length = array.length;
		int minIdx;
		for (int idx = 0; idx < length; idx++) {
			minIdx = idx;
			for (int jdx = idx + 1; jdx < length; jdx++) {
				if (ExampleUtils.less(array[jdx], array[minIdx])) {
					minIdx = jdx;
				}
			}
			ExampleUtils.exch(array, idx, minIdx);
		}
	}
}
