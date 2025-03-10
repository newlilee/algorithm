package com.algorithm.chaptertwo.sort.compare;

import com.algorithm.chaptertwo.sort.first.InsertionSort;
import com.algorithm.chaptertwo.sort.first.SelectionSort;
import com.algorithm.util.Stopwatch;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author clx 2018/7/4.
 */
public class SortCompare {

	public static void main(String[] args) {
		long firstTime = timeRandomInput("selectionsort", 8, 5);
		long secondTime = timeRandomInput("insertionsort", 8, 5);
		System.out.println("first:" + firstTime);
		System.out.println("second:" + secondTime);
	}

	private static long timeRandomInput(String algorithm, int len, int total) {
		long totalTime = 0;
		for (int idx = 0; idx < total; idx++) {
			Integer[] array = new Integer[len];
			for (int jdx = 0; jdx < len; jdx++) {
				array[jdx] = StdRandom.uniform(jdx);
			}
			totalTime += time(algorithm, array);
		}
		return totalTime;
	}

	private static long time(String algorithm, Integer[] array) {
		Stopwatch stopwatch = new Stopwatch();
		if ("selectionsort".equals(algorithm)) {
			SelectionSort.sort(array);
		}
		if ("insertionsort".equals(algorithm)) {
			InsertionSort.sort(array);
		}
		return stopwatch.elapsedNanoTime();
	}
}
