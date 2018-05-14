package com.algorithm.chapterone.normal.first;

/**
 * @author clx 2017/12/24 12:08
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int key = 1;
		System.out.println(BinarySearch.binarySearchRecursive(key, array, 0, 9));
		System.out.println(binarySearch(key, array));
	}

	/**
	 * binarySearchRecursive
	 * 
	 * @param key
	 * @param array
	 * @param low
	 * @param high
	 * @return
	 */
	private static int binarySearchRecursive(int key, int[] array, int low, int high) {
		if (array == null || array.length == 0) {
			return -1;
		}
		if (low > high) {
			return -1;
		}

		int mid = (low + high) >>> 1;
		if (key < array[mid]) {
			return binarySearchRecursive(key, array, low, mid - 1);
		} else if (key > array[mid]) {
			return binarySearchRecursive(key, array, mid + 1, high);
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
		if (array == null || array.length == 0) {
			return -1;
		}

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
