package com.algorithm.chapterone.normal;

/**
 * @author clx 2017/12/24 12:08
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 6;
		System.out.println(BinarySearch.rank(key, array));
	}

	private static int rank(int key, int[] array) {
		int lo = 0;
		int hi = array.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < array[mid]) {
				hi = mid - 1;
			} else if (key > array[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
