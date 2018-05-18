package com.algorithm.practice.chapterone.second;

/**
 * search element
 *
 * @author clx 2018/3/6.
 */
public class SearchElement {

	/**
	 * binary search
	 *
	 * @param array  sorted array
	 * @param target target number
	 * @return result number
	 */
	private static int binarySearch(int[] array, int target) {
		if (array == null || array.length == 0) {
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

	/**
	 * find first element great than target
	 *
	 * @param array  sorted array,sort type desc
	 * @param target target number
	 * @return first element great than target
	 */
	private static int firstGreatThanElement(final int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}

		int low = 0;
		int high = array.length - 1;
		while (low < high) {
			int mid = (low + high) >>> 1;
			if (array[mid] >= target) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}

		if (array[low] <= array[high]) {
			if (target <= array[low]) {
				return array[low];
			} else if (array[low] < target && target <= array[high]) {
				return array[high];
			} else {
				return -1;
			}
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		int[] array = new int[]{1, 2, 3, 4, 5, 7, 8, 10};
		int key = 0;
		System.out.println(firstGreatThanElement(array, key));
	}
}