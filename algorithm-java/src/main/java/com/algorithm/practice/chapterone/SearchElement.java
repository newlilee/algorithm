package com.algorithm.practice.chapterone;

/**
 * search element
 *
 * @author clx 2018/3/6.
 */
public class SearchElement {

	/**
	 * find first element great than target
	 *
	 * @param array
	 * @param target
	 * @return
	 */
	private static int firstGreatthanElement(int[] array, int target) {
		if (array == null) {
			return -1;
		}
		if (array.length == 0) {
			return -1;
		}
		int low = 0;
		int high = array.length - 1;
		while (low <= high) {
			int mid = (low + high) >>> 1;
			if (target > array[mid]) {
				low = mid + 1;
			} else if (target < array[mid]) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 6;
		System.out.println(firstGreatthanElement(array, key));
	}
}
