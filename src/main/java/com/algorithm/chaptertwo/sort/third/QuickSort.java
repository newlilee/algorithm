package com.algorithm.chaptertwo.sort.third;

import com.algorithm.chaptertwo.sort.util.SortUtils;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author clx 2/17/2018
 */
public class QuickSort {

	/**
	 * quick sort
	 *
	 * @param array
	 */
	public static void sort(Integer[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		// shuffle
		StdRandom.shuffle(array);
		QuickSort.sort(array, 0, array.length - 1);
	}

	/**
	 * sort
	 *
	 * @param array
	 * @param lo
	 * @param hi
	 */
	private static void sort(Integer[] array, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		// partition array
		int idx = QuickSort.partition(array, lo, hi);
		// sort left
		sort(array, lo, idx - 1);
		// sort right
		sort(array, idx + 1, hi);
	}

	/**
	 * partition array
	 *
	 * @param array
	 * @param lo
	 * @param hi
	 */
	private static int partition(Integer[] array, int lo, int hi) {
		int idx = lo;
		int jdx = hi + 1;
		Integer pivot = array[lo];
		while (true) {
			while (SortUtils.less(array[++idx], pivot)) {
				if (idx == hi) {
					break;
				}
			}
			while (SortUtils.less(pivot, array[--jdx])) {
				if (jdx == lo) {
					break;
				}
			}
			if (idx >= jdx) {
				break;
			}
			SortUtils.exchange(array, idx, jdx);
		}
		SortUtils.exchange(array, lo, jdx);
		return jdx;
	}
}
