package com.algorithm.chapterone.normal.second;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

/**
 * 模拟抛硬币
 * 
 * @author clx 2018/3/21.
 */
public class Flips {

	public static void main(String[] args) {
		System.out.println("Please input flip time:");
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			int flipTime = scanner.nextInt();
			Counter heads = new Counter("heads");
			Counter tails = new Counter("tails");
			for (int idx = 0; idx < flipTime; idx++) {
				if (StdRandom.bernoulli(0.5)) {
					heads.increment();
				} else {
					tails.increment();
				}
			}
			StdOut.println(heads);
			StdOut.println(tails);
			int delta = heads.tally() - tails.tally();
			System.out.println("delta:" + Math.abs(delta));
		}
	}
}
