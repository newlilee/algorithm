package com.algorithm.chaptertwo.sort.first;

import java.util.ArrayList;
import java.util.List;

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
		if (SortUtils.checkArrayValid(array)) {
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

	/**
	 * shell sort pre compute sequence
	 * 
	 * @param array
	 */
	public static void sortEnhance(Comparable[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return;
		}
		int len = array.length;
		int h = 1;
		List<Integer> sequence = new ArrayList<>();
		sequence.add(h);
		while (h < len / 3) {
			h = 3 * h + 1;
			sequence.add(h);
		}
		int seq = sequence.size() - 1;
		while (h >= 1) {
			for (int idx = h; idx < len; idx++) {
				for (int jdx = idx; jdx >= h && SortUtils.less(array[jdx], array[jdx - h]); jdx -= h) {
					SortUtils.exch(array, jdx, jdx - h);
				}
			}
			if (seq == 0) {
				break;
			}
			h = sequence.get(seq - 1);
			seq--;
		}
	}
}
