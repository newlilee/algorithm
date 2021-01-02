package com.algorithm.chapterone.normal.fourth;

import com.algorithm.util.Stopwatch;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author clx 2018/5/12
 */
public class TestDoubling {

	private static double timeTrail(int len) {
		int max = 1000000;
		int[] array = new int[len];
		for (int idx = 0; idx < len; idx++) {
			array[idx] = StdRandom.uniform(-max, max);
		}
		Stopwatch timer = new Stopwatch();
		int count = ThreeSum.count(array);
		System.out.println("count:" + count);
		return timer.elapsedSecondTime();
	}

	public static void main(String[] args) {
		for (int idx = 250; true; idx += idx) {
			double time = timeTrail(idx);
			StdOut.printf("%7d %5.1f\n", idx, time);
		}
	}
}
