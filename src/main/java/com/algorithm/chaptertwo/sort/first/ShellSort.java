package com.algorithm.chaptertwo.sort.first;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/4.
 */
public class ShellSort {

	/**
	 * shell sort
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
		int h = 1;
		while (h < len / 3) {
			h = 3 * h + 1;
		}
		while (h >= 1) {
			for (int idx = h; idx < len; idx++) {
				for (int jdx = idx; jdx >= h && SortUtils.less(array[jdx], array[jdx - h]); jdx -= h) {
					SortUtils.exch(array, jdx, jdx - h);
				}
			}
			h = h / 3;
		}
	}
}
