package com.algorithm.chapterone.normal.first;

import com.algorithm.util.SortUtils;

/**
 * @author clx 2017/12/24 12:08
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 1;
		System.out.println(BinarySearch.binarySearchRecursive(key, array, 0, 9));
		System.out.println(binarySearch(key, array));
	}

	/**
	 * binarySearchRecursive
	 *
	 * @param key
	 * @param array
	 * @param lo
	 * @param hi
	 * @return
	 */
	private static int binarySearchRecursive(int key, int[] array, int lo, int hi) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		rangeCheck(array.length, lo, hi);
		int mid = lo + (hi - lo) / 2;
		if (key < array[mid]) {
			return binarySearchRecursive(key, array, lo, mid - 1);
		} else if (key > array[mid]) {
			return binarySearchRecursive(key, array, mid + 1, hi);
		} else {
			return mid;
		}
	}

	/**
	 * binary search
	 *
	 * @param key
	 * @param array
	 * @return
	 */
	public static int binarySearch(int key, int[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}

		int lo = 0;
		int hi = array.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key == array[mid]) {
				return mid;
			} else if (key > array[mid]) {
				lo = mid + 1;
			} else if (key < array[mid]) {
				hi = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * range check
	 *
	 * @param arrayLength
	 * @param fromIdx
	 * @param toIdx
	 */
	public static void rangeCheck(int arrayLength, int fromIdx, int toIdx) {
		if (fromIdx > toIdx) {
			throw new IllegalArgumentException(String.format("fromIdx:%s > toIndex:%s", fromIdx, toIdx));
		}
		if (fromIdx < 0) {
			throw new ArrayIndexOutOfBoundsException(fromIdx);
		}
		if (toIdx > arrayLength) {
			throw new ArrayIndexOutOfBoundsException(toIdx);
		}
	}
}
