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
		if (firstArr == null){

		}
		int[] mergedArr = new int[firstArr.length + secondArr.length];
		int idx = 0;
		int jdx = 0;
		int kdx = 0;
		while (idx < firstArr.length || jdx < secondArr.length) {
			if (secondArr.length == 0) {
				mergedArr = firstArr;
				break;
			}
			if (firstArr.length == 0) {
				mergedArr = secondArr;
				break;
			}

			if (firstArr[idx] < secondArr[jdx]) {
				mergedArr[kdx++] = firstArr[idx++];
			} else if (firstArr[idx] > secondArr[jdx]) {
				mergedArr[kdx++] = secondArr[jdx++];
			} else {
				mergedArr[kdx++] = firstArr[idx++];
				mergedArr[kdx++] = secondArr[jdx++];
			}
		}

		int len = mergedArr.length;
		if (len % 2 == 0) {
			return (mergedArr[len / 2 - 1] + mergedArr[len / 2]) / 2;
		} else {
			return mergedArr[len / 2];
		}
	}
}
