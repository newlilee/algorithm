package com.leetcode;

/**
 * leetcode 4
 * Median of Two Sorted Arrays
 *
 * @author clx
 */
public class MedianTwoSortedArray {

	/**
	 * brute force
	 *
	 * @param firstArr
	 * @param secondArr
	 * @return
	 */
	public static double medianOfBruteForce(int[] firstArr, int[] secondArr) {
		if (firstArr == null && secondArr == null) {
			return -1;
		}
		int mergedLen = 0;
		if (firstArr == null) {
			mergedLen = secondArr.length;
		} else if (secondArr == null) {
			mergedLen = firstArr.length;
		} else {
			mergedLen = firstArr.length + secondArr.length;
		}
		int[] mergedArr = new int[mergedLen];
		int idx = 0;
		int jdx = 0;
		int kdx = 0;
		while (idx < firstArr.length || jdx < secondArr.length) {
			if (idx == firstArr.length) {
				mergedArr[kdx++] = secondArr[jdx];
				jdx++;
				continue;
			}
			if (jdx == secondArr.length) {
				mergedArr[kdx++] = firstArr[idx];
				idx++;
				continue;
			}

			if (firstArr[idx] < secondArr[jdx]) {
				mergedArr[kdx++] = firstArr[idx];
				idx++;
			} else if (firstArr[idx] > secondArr[jdx]) {
				mergedArr[kdx++] = secondArr[jdx];
				jdx++;
			} else {
				mergedArr[kdx++] = firstArr[idx];
				mergedArr[kdx++] = secondArr[jdx];
				idx++;
				jdx++;
			}
		}

		int len = mergedArr.length;
		if (len % 2 == 0) {
			return ((double) mergedArr[len / 2 - 1] + mergedArr[len / 2]) / 2;
		} else {
			return mergedArr[len / 2];
		}
	}
}
