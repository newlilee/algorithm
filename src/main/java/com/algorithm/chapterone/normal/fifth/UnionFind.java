package com.algorithm.chapterone.normal.fifth;

/**
 * union-find algorithm <br/>
 * 0.以分量中的某个触点名称作为分量的标识符
 * 
 * @author clx 2018/5/17.
 */
public class UnionFind {

	/**
	 * 分量id,以触点作为索引
	 */
	private int[] id;
	/**
	 * 分量count
	 */
	private int count;

	/**
	 * init
	 * 
	 * @param count
	 */
	public UnionFind(int count) {
		this.count = count;
		id = new int[count];
		for (int idx = 0; idx < count; idx++) {
			id[idx] = idx;
		}
	}

	/**
	 * add or merge connect
	 * 
	 * @param p
	 * @param q
	 */
	public void union(int p, int q) {

	}

	/**
	 * find p's 所在分量的标识符
	 * 
	 * @param p
	 * @return
	 */
	public int find(int p) {

		return -1;
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
