package com.algorithm.chapterone.normal.fifth;

import edu.princeton.cs.algs4.StdIn;

/**
 * union-find test
 * 
 * @author clx 2018/5/17.
 */
public class TestUnionFind {

	public static void main(String[] args) {
		// read contract count
		int count = StdIn.readInt();
		// init UnionFind
		UnionFind unionFind = new UnionFind(count);
		while (!StdIn.isEmpty()) {
			// read p q
			int p = StdIn.readInt();
			int q = StdIn.readInt();
			if (unionFind.connected(p, q)) {
				continue;
			}
			// merge
			unionFind.union(p, q);
			System.out.println("p:" + p + "-->q:" + q);
		}
		System.out.println(unionFind.count() + "components");
	}
}
