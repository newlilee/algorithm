package com.algorithm.chapterone.normal.fourth;

import com.leetcode.util.Stopwatch;

/**
 * @author clx 2018/5/9.
 */
public class TestStopwatch {
	public static void main(String[] args) {
		Stopwatch stopwatch = new Stopwatch();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("elapsed time:" + stopwatch.elapsedSecondTime());
	}
}
