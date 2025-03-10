package com.algorithm.chapterone.normal.fourth;

/**
 * @author clx 2018/5/15.
 */
public class TwoSum {

	/**
	 * count n*n
	 * 
	 * @param array
	 * @return
	 */
	public static int count(int[] array) {
		int len = array.length;
		int count = 0;
		for (int idx = 0; idx < len; idx++) {
			for (int j = idx + 1; j < len; j++) {
				if ((array[idx] + array[j]) == 0) {
					count++;
				}
			}
		}
		return count;
	}
}
