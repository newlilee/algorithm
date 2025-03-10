package com.algorithm.chapterone.normal.second;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author clx 2018/3/26
 */
public class Whitelist {

	public static void main(String[] args) {
		int[] array = null;
		StaticSetOfInts set = new StaticSetOfInts(array);
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if (!set.contains(key)) {
				System.out.println(key);
			}
		}
	}
}
