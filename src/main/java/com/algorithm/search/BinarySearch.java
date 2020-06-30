package com.algorithm.search;

import com.algorithm.util.SortUtils;

/**
 * @author chenlixin at 2016年3月28日 上午11:07:02
 */
public class BinarySearch {

	/**
	 * cycle
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public static int binarySearch(int[] array, int target) {
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (target == array[mid]) {
				return mid;
			} else if (target < array[mid]) {
				high = mid - 1;
			} else if (target > array[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

	/**
	 * recursion
	 *
	 * @param key
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	public static int rank(int key, int[] array, int low, int high) {
		if (low > high) {
			return -1;
		}
		int mid = low + (high - low) / 2;
		if (key < array[mid]) {
			return rank(key, array, low, mid - 1);
		} else if (key > array[mid]) {
			return rank(key, array, mid + 1, high);
		} else {
			return mid;
		}
	}

	/**
	 * left bound
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public static int leftBound(int[] array, int target) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target > array[mid]) {
				left = mid + 1;
			} else if (target < array[mid]) {
				right = mid - 1;
			} else if (target == array[mid]) {
				right = mid - 1;
			}
		}
		if (left >= array.length || target != array[left]) {
			return -1;
		}
		return left;
	}

	/**
	 * right bound
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	public static int rightBound(int[] array, int target) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (target > array[mid]) {
				left = mid + 1;
			} else if (target < array[mid]) {
				right = mid - 1;
			} else if (target == array[mid]) {
				left = mid + 1;
			}
		}

		if (right < 0 || target != array[right]) {
			return -1;
		}
		return right;
	}
}
