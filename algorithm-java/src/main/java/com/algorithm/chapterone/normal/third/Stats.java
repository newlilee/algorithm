package com.algorithm.chapterone.normal.third;

import com.algorithm.chapterone.normal.third.Bag;
import edu.princeton.cs.algs4.StdIn;

/**
 * @author chenlixin at 2017年2月21日 下午5:11:44
 */
public class Stats {

	public static void stats() {
		Bag<Double> numbers = new Bag<Double>();
		while (!StdIn.isEmpty()) {
			numbers.add(StdIn.readDouble());
		}
		Integer N = numbers.size();
		Double sum = 0.0;
		for (Double x : numbers) {
			sum += x;
		}

		Double mean = sum / N;

		sum = 0.0;
		for (Double x : numbers) {
			sum += (x - mean) * (x - mean);
		}
		Double std = Math.sqrt(sum / (N - 1));
		System.out.println("mean:" + mean);
		System.out.println("std:" + std);
	}

	public static void main(String[] args) {

	}
}
