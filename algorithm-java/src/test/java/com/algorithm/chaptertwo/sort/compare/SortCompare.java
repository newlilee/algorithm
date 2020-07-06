package com.algorithm.chaptertwo.sort.compare;

import org.apache.commons.lang3.StringUtils;

import com.algorithm.chapterone.normal.fourth.Stopwatch;
import com.algorithm.chaptertwo.sort.first.InsertionSort;
import com.algorithm.chaptertwo.sort.first.SelectionSort;

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
		if (StringUtils.equalsIgnoreCase(algorithm, "selectionsort")) {
			SelectionSort.sort(array);
		}
		if (StringUtils.equalsIgnoreCase(algorithm, "insertionsort")) {
			InsertionSort.sort(array);
		}
		return stopwatch.elapsedNanoTime();
	}
}
