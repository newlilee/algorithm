package com.algorithm.sort;

/**
 * @author clx 2016年4月24日 下午4:47:13
 */
public class InsertionSort {

	@SuppressWarnings("rawtypes")
	public static void sort(Comparable[] array) {
		int N = array.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0 && ExampleUtils.less(array[j], array[j - 1]); j--) {
				ExampleUtils.exch(array, j, j - 1);
			}
		}
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[] { 5, 7, 6, 1, 4, 3, 2 };
		ExampleUtils.show(array);
		InsertionSort.sort(array);
		ExampleUtils.show(array);
	}
}
