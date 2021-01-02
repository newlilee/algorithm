package com.algorithm.chapterone.normal.fourth;

import com.leetcode.util.Stopwatch;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author clx 2018/5/7
 */
public class TestThreeSum {
	public static void main(String[] args) {
		int[] array = {1, 2, 4, 5, 6, -8, -9, -11, 3, 2, 5, 7, 8, -2};
		Stopwatch stopwatch = new Stopwatch();
		StdOut.println(ThreeSum.count(array));
		System.out.println("elapsedTime:" + stopwatch.elapsedNanoTime());
	}
}
