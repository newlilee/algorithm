package com.algorithm.chaptertwo.sort.second;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/5.
 */
public class MergeSort {

	/**
	 * extra array
	 */
	private static Integer[] aux;

	/**
	 * in-place merge sort
	 *
	 * @param array
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	public static void inPlaceMergeSort(Integer[] array, int lo, int mid, int hi) {
		// check array
		if (SortUtils.checkArrayValid(array)) {
			return;
		}

	}

	/**
	 * merge
	 *
	 * @param array
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	private static void merge(Integer[] array, int lo, int mid, int hi) {
		// check array
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		// merge array[lo..mid],array[mid+1..hi]
		int idx = lo;
		int jdx = mid + 1;
		// copy array
		System.arraycopy(array, 0, aux, 0, array.length);
		// merge back to array[lo..hi]
		for (int k = lo; k <= hi; k++) {
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
	 * top-down merge sort
	 *
	 * @param array
	 */
	public static void topDownMergeSort(Integer[] array) {
		// check array
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		int len = array.length;
		aux = new Integer[len];
		topDownSort(array, 0, len - 1);
	}

	/**
	 * top-down sort
	 *
	 * @param array
	 * @param lo
	 * @param hi
	 */
	private static void topDownSort(Integer[] array, int lo, int hi) {
		// sort array[lo..hi]
		if (hi <= lo) {
			return;
		}
		int mid = (lo + hi) >>> 1;
		// sort left
		topDownSort(array, lo, mid);
		// sort right
		topDownSort(array, mid + 1, hi);
		// merge
		MergeSort.merge(array, lo, mid, hi);
	}

	/**
	 * bottom-top merge sort
	 *
	 * @param array
	 */
	public static void bottomTopMergeSort(Integer[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		int len = array.length;
		aux = new Integer[len];
		for (int sa = 1; sa < len; sa = sa * 2) {
			for (int lo = 0; lo < len - sa; lo += sa * 2) {
				MergeSort.merge(array, lo, lo + sa - 1, Math.min(lo + sa + sa - 1, len - 1));
			}
		}
	}
}
