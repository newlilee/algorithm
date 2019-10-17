package com.algorithm.chaptertwo.sort.third;

import com.algorithm.chaptertwo.sort.util.SortUtils;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author clx 2/20/2018
 */
public class QuickSortThreeWay {

	/**
	 * quick sort
	 * 
	 * @param array
	 */
	public static void sort(Comparable[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		StdRandom.shuffle(array);
		sort(array, 0, array.length - 1);
	}

	/**
	 * sort
	 * 
	 * @param array
	 * @param lo
	 * @param hi
	 */
	private static void sort(Comparable[] array, int lo, int hi) {
		if (hi <= lo) {
			return;
		}
		int lt = lo, idx = lo + 1, gt = hi;
		Comparable pivot = array[lo];
		while (idx <= gt) {
			int cmp = array[idx].compareTo(pivot);
			if (cmp < 0) {
				SortUtils.exchange(array, lt++, idx++);
			} else if (cmp > 0) {
				SortUtils.exchange(array, idx, gt--);
			} else {
				idx++;
			}
		}
		sort(array, lo, lt - 1);
		sort(array, gt + 1, hi);
	}
}
