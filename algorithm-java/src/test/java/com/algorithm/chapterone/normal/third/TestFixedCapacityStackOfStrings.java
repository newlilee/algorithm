package com.algorithm.chapterone.normal.third;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author clx 2018/4/7
 */
public class TestFixedCapacityStackOfStrings {

	public static void main(String[] args) {
		FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(100);
		while (!StdIn.isEmpty()) {
			String item = StdIn.readString();
			if (!item.equals("-")) {
				s.push(item);
			} else if (!s.isEmpty()) {
				StdOut.print(s.pop() + " ");
			}
		}
		StdOut.println("(" + s.size() + " left in stack)");
	}
}
