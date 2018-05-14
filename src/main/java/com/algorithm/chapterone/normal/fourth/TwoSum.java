package com.algorithm.chapterone.normal.fourth;

import com.algorithm.chapterone.normal.first.BinarySearch;

import java.util.Arrays;

/**
 * @author clx 2018/5/14.
 */
public class TwoSum {

	/**
	 * count
	 * 
	 * @param array
	 * @return
	 */
	public static int count(int[] array) {
		int len = array.length;
		int count = 0;
		Arrays.sort(array);
		for (int idx = 0; idx < len; idx++) {
			if (BinarySearch.binarySearch(-array[idx], array) > idx) {
				count++;
			}
		}
		return count;
	}
}
