package com.algorithm.chaptertwo.sort.second;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/5.
 */
public class MergeSort {

	/**
	 * in-place merge sort
	 * 
	 * @param array
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	public static void inPlaceMergeSort(Comparable[] array, int lo, int mid, int hi) {
		if (array == null) {
			return;
		}
		if (array.length == 0) {
			return;
		}
		int idx = lo, jdx = mid + 1;
		int len = array.length;
		Comparable[] aux = new Comparable[len];
		// copy array
		for (int k = 0; k < len; k++) {
			aux[k] = array[k];
		}
		// System.arraycopy(array, 0, aux, 0, len);

		for (int k = 0; k < len; k++) {
			if (idx > mid) {
				array[k] = aux[jdx++];
			} else if (jdx > hi) {
				array[k] = aux[idx++];
			} else if (SortUtils.less(aux[jdx], aux[idx])) {
				array[k] = aux[jdx++];
			} else {
				array[k] = aux[idx++];
			}
		}
	}

	/**
	 * merge sort
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

	}
}
