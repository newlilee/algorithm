package com.algorithm.chapterone.normal.fourth;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author clx 2018/5/7
 */
public class TestThreeSum {
	public static void main(String[] args) {
		int[] array = StdIn.readAllInts();
		StdOut.println(ThreeSum.count(array));
	}
}
