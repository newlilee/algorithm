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
	public static void sort(Integer[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		int len = array.length;
		for (int idx = 1; idx < len; idx++) {
			for (int jdx = idx; jdx > 0 && SortUtils.less(array[jdx], array[jdx - 1]); jdx--) {
				SortUtils.exchange(array, jdx, jdx - 1);
			}
		}
	}

	/**
	 * Insertion sort enhance
	 *
	 * @param array
	 */
	public static void sortEnhance(Integer[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		int len = array.length;
		for (int idx = 1; idx < len; idx++) {
			Integer key = array[idx];
			int jdx = idx - 1;
			while (jdx >= 0 && SortUtils.less(key, array[jdx])) {
				array[jdx + 1] = array[jdx];
				jdx--;
			}
			array[jdx + 1] = key;
		}
	}
}
