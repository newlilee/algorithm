package com.algorithm.chapterone.normal.fourth;

/**
 * @author clx 2018/5/15.
 */
public class TestThreeSumFast {

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 6, -8, -9, -11, 3, 2, 5, 7, 8, -2 };
		Stopwatch stopwatch = new Stopwatch();
		System.out.println(ThreeSumFast.count(array));
		System.out.println("elapsedTime:" + stopwatch.elapsedNanoTime());
	}
}
