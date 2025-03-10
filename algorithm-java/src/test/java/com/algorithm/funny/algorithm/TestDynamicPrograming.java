package com.algorithm.funny.algorithm;

import java.util.HashMap;

import com.algorithm.util.Stopwatch;

/**
 * @author clx 2018/5/23.
 */
public class TestDynamicPrograming {

	public static void main(String[] args) {
		int steps = 20;
		Stopwatch stopwatch = new Stopwatch();
		System.out.println("1:" + DynamicPrograming.getClimbingWays(steps));
		System.out.println(stopwatch.elapsedNanoTime());
		stopwatch = new Stopwatch();
		System.out.println("2:" + DynamicPrograming.getClimbingWays(steps, new HashMap<Integer, Integer>()));
		System.out.println(stopwatch.elapsedNanoTime());
		stopwatch = new Stopwatch();
		System.out.println("3:" + DynamicPrograming.climbingWays(steps));
		System.out.println(stopwatch.elapsedNanoTime());
	}
}
