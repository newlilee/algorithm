package com.algorithm.chapterone.normal.fifth;

import edu.princeton.cs.algs4.StdIn;

/**
 * union-find test
 * 
 * @author clx 2018/5/17.
 */
public class TestUnionFind {

	public static void main(String[] args) {
		versionFirst();
		versionSecond();
	}

	/**
	 * 
	 */
	private static void versionSecond() {
		// read contract count
		int count = StdIn.readInt();
		// init UnionFind
		com.algorithm.chapterone.normal.fifth.ver.second.UnionFind unionFind = new com.algorithm.chapterone.normal.fifth.ver.second.UnionFind(
				count);
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

	/**
	 * 时间复杂度：(N+3)(N-1) ~ N^2
	 */
	private static void versionFirst() {
		// read contract count
		int count = StdIn.readInt();
		// init UnionFind
		com.algorithm.chapterone.normal.fifth.ver.first.UnionFind unionFind = new com.algorithm.chapterone.normal.fifth.ver.first.UnionFind(
				count);
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
