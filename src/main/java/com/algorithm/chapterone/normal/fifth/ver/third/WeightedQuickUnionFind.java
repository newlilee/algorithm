package com.algorithm.chapterone.normal.fifth.ver.third;

/**
 * union-find algorithm <br/>
 * 0.
 * 
 * @author clx 2018/5/17.
 */
public class WeightedQuickUnionFind {

	/**
	 * 分量id,以触点作为索引<br/>
	 * 以分量中的某个触点名称作为分量的标识符
	 */
	private int[] id;
	/**
	 * 各个根节点所对应的分量的大小
	 */
	private int[] sz;
	/**
	 * 分量count
	 */
	private int count;

	/**
	 * init
	 * 
	 * @param count
	 */
	public WeightedQuickUnionFind(int count) {
		this.count = count;
		id = new int[count];
		sz = new int[count];
		for (int idx = 0; idx < count; idx++) {
			id[idx] = idx;
			sz[idx] = 1;
		}
	}

	/**
	 * add or merge connect <br/>
	 * Weighted quick-find
	 * 
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {
		int i = find(p);
		int j = find(q);
		if (i == j) {
			return;
		}

		if (sz[i] < sz[j]) {
			id[i] = j;
			sz[j] += sz[i];
		} else {
			id[j] = i;
			sz[i] += sz[j];
		}
		count--;
	}

	/**
	 * find p's 所在分量的标识符
	 * 
	 * @param p
	 * @return
	 */
	public int find(int p) {
		while (p != id[p]) {
			p = id[p];
		}
		return p;
	}

	/**
	 * 判断p、q是否在同一个分量中
	 * 
	 * @param p
	 * @param q
	 * @return
	 */
	public boolean connected(int p, int q) {
		return find(p) == find(q);
	}

	/**
	 * count 触点
	 * 
	 * @return
	 */
	public int count() {
		return this.count;
	}
}
