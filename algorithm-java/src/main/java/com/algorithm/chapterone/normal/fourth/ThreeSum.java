package com.algorithm.chapterone.normal.fourth;

/**
 * @author clx 2018/5/6
 */
public class ThreeSum {

	/**
	 * count sum is zero
	 * 
	 * @param array
	 * @return
	 */
	public static int count(int[] array) {
		int len = array.length;
		int count = 0;
		for (int idx = 0; idx < len; idx++) {
			for (int j = idx + 1; j < len; j++) {
				for (int k = j + 1; k < len; k++) {
					if (array[idx] + array[j] + array[k] == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
