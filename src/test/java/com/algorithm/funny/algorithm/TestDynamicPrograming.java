package com.algorithm.funny.algorithm;

import com.algorithm.chapterone.normal.fourth.Stopwatch;

import java.util.HashMap;

/**
 * @author clx 2018/5/23.
 */
public class TestDynamicPrograming {

	public static void main(String[] args) {
		int steps = 20;
		Stopwatch stopwatch = new Stopwatch();
		System.out.println(DynamicPrograming.getClimbingWays(steps));
		System.out.println(stopwatch.elapsedNanoTime());
		stopwatch = new Stopwatch();
		System.out.println(DynamicPrograming.getClimbingWays(steps, new HashMap<Integer, Integer>()));
		System.out.println(stopwatch.elapsedNanoTime());
	}
}
