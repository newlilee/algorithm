package com.algorithm.chaptertwo.sort.first;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/3.
 */
public class InsertionSort {

	/**
	 * Insertion sort
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
		int len = array.length;
		for (int idx = 1; idx < len; idx++) {
			for (int jdx = idx; jdx > 0 && SortUtils.less(array[jdx], array[jdx - 1]); jdx--) {
				SortUtils.exch(array, jdx, jdx - 1);
			}
		}
	}

	/**
	 * Insertion sort enhance
	 * 
	 * @param array
	 */
	public static void sortEnhance(Comparable[] array) {
		if (array == null) {
			return;
		}
		if (array.length == 0) {
			return;
		}
		int len = array.length;
		for (int idx = 1; idx < len; idx++) {
			for (int jdx = idx; jdx > 0 && SortUtils.less(array[jdx], array[jdx - 1]); jdx--) {

			}
		}
	}
}
