package com.algorithm.chapterone.normal.second;

import java.util.Arrays;

/**
 * @author clx 2018/3/26
 */
public class StaticSetOfInts {
	/**
	 * array
	 */
	private int[] array;

	public StaticSetOfInts(int[] array) {
		this.array = new int[array.length];
		for (int idx = 0; idx < array.length; idx++) {
			this.array[idx] = array[idx];
		}
		Arrays.sort(this.array);
	}

	/**
	 * contains key
	 *
	 * @param key
	 * @return
	 */
	public boolean contains(int key) {
		return this.binarySearch(key) != -1;
	}

	/**
	 * binarySearch
	 * 
	 * @param key
	 * @return
	 */
	private int binarySearch(int key) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (key > array[mid]) {
				low = mid + 1;
			} else if (key < array[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
