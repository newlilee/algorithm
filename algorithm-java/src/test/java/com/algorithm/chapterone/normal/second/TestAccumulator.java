package com.algorithm.chapterone.normal.second;

import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * test case for accumulator
 * 
 * @author clx 2018/3/23.
 */
public class TestAccumulator {

	public static void main(String[] args) {
		System.out.println("Please input a number:");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			int count = scanner.nextInt();
			Accumulator accumulator = new Accumulator();
			for (int idx = 1; idx < count; idx++) {
				accumulator.addDeltaValue(StdRandom.uniform());
			}
			System.out.println(accumulator);
		}
	}
}
