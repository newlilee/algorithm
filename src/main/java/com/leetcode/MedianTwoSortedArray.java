package com.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

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
		if (firstArr == null || secondArr == null) {
			return -1;
		}
		int mergedLen = firstArr.length + secondArr.length;
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

	/**
	 * use binary heap
	 *
	 * @param firstArr
	 * @param secondArr
	 * @return
	 */
	public static double medianOfSortedArr(int[] firstArr, int[] secondArr) {
		if (firstArr == null || secondArr == null) {
			return -1;
		}

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for (int ele : firstArr) {
			add(minHeap, maxHeap, ele);
		}
		for (int ele : secondArr) {
			add(minHeap, maxHeap, ele);
		}
		if (minHeap.size() > maxHeap.size()) {
			return minHeap.peek();
		} else {
			return (minHeap.peek() + maxHeap.peek()) / 2.0;
		}
	}

	private static void add(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap, int num) {
		if (minHeap.size() == maxHeap.size()) {
			maxHeap.offer(num);
			minHeap.offer(maxHeap.poll());
		} else {
			minHeap.offer(num);
			maxHeap.offer(minHeap.poll());
		}
	}
}
