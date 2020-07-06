package com.algorithm.chapterone.normal.fourth;

import java.util.Arrays;

import com.algorithm.chapterone.normal.first.BinarySearch;

/**
 * @author clx 2018/5/15.
 */
public class ThreeSumFast {

	/**
	 * count N*NlogN
	 * 
	 * @param array
	 * @return
	 */
	public static int count(int[] array) {
		int len = array.length;
		int count = 0;
		Arrays.sort(array);
		for (int idx = 0; idx < len; idx++) {
			for (int j = idx + 1; j < len; j++) {
				if (BinarySearch.binarySearch(-(array[idx] + array[j]), array) > j) {
					count++;
				}
			}
		}
		return count;
	}
}
