package com.leetcode.util;

import java.util.Arrays;

/**
 * @author clx 2016年4月18日 下午10:39:59
 */
public class ArrayUtils {

	private ArrayUtils() {
		throw new IllegalStateException("Utility class.");
	}

	/**
	 * sort method
	 *
	 * @param array
	 */
	public static void sort(int[] array) {
	}

	/**
	 * compare sorted
	 *
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean less(Integer v, Integer w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * exchange element
	 *
	 * @param array
	 * @param i
	 * @param j
	 */
	public static void exchange(int[] array, int i, int j) {
		if (ArrayUtils.checkArrayValid(array)) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * print array
	 *
	 * @param array
	 */
	public static void printArray(int[] array) {
		if (array == null) {
			System.out.println("null");
			return;
		}
		if (array.length == 0) {
			System.out.println("[]");
			return;
		}
		System.out.println(Arrays.toString(array));
	}

	/**
	 * judge array is or not sorted
	 *
	 * @param array
	 * @return
	 */
	public static boolean isSorted(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return false;
		}
		for (int i = 1; i < array.length; i++) {
			if (ArrayUtils.less(array[i], array[i - 1])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * enhance sorted test
	 *
	 * @param array
	 * @return
	 */
	public static boolean isSortedEnhance(int[] array) {
		if (ArrayUtils.checkArrayValid(array)) {
			return false;
		}

		int count = 0;
		for (int idx = 1; idx < array.length; idx++) {
			int key = array[idx];
			int jdx = idx - 1;
			while (jdx >= 0 && less(key, array[jdx])) {
				array[jdx + 1] = array[jdx];
				jdx--;
				count++;
			}
			array[jdx + 1] = key;
		}
		return count == 0;
	}

	/**
	 * array is valid <br/>
	 * return true if not valid, return false if valid
	 *
	 * @param array
	 */
	public static boolean checkArrayValid(int[] array) {
		return array == null || array.length == 0;
	}
}
