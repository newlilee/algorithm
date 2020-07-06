package com.algorithm.chaptertwo.sort.forth;

/**
 * @author clx 2/21/2018
 */
public class MaxPriorityQueue<Key extends Comparable<Key>> {

	/**
	 * 二叉堆
	 */
	private Key[] pq;
	/**
	 * pq[1...len]
	 */
	private int len = 0;

	public Key[] getPq() {
		return this.pq;
	}

	/**
	 * init pq
	 */
	public MaxPriorityQueue() {

	}

	/**
	 * init capacity max pq
	 * 
	 * @param max
	 */
	public MaxPriorityQueue(int max) {
		pq = (Key[]) new Comparable[max + 1];
	}

	/**
	 * use array init pq
	 * 
	 * @param array
	 */
	public MaxPriorityQueue(Key[] array) {

	}

	/**
	 * insert
	 * 
	 * @param val
	 */
	public void insert(Key val) {
		pq[++len] = val;
		this.swim(len);
	}

	/**
	 * return max element
	 * 
	 * @return max
	 */
	public Key max() {
		return pq[1];
	}

	/**
	 * delete max
	 * 
	 * @return max
	 */
	public Key deleteMax() {
		Key max = pq[1];
		this.exch(1, len--);
		pq[len + 1] = null;
		this.sink(1);
		return max;
	}

	/**
	 * is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return len == 0;
	}

	/**
	 * size
	 * 
	 * @return
	 */
	public int size() {
		return len;
	}

	/**
	 * less
	 * 
	 * @param idx
	 * @param jdx
	 * @return
	 */
	private boolean less(int idx, int jdx) {
		return pq[idx].compareTo(pq[jdx]) < 0;
	}

	/**
	 * exch
	 * 
	 * @param idx
	 * @param jdx
	 */
	private void exch(int idx, int jdx) {
		Key temp = pq[idx];
		pq[idx] = pq[jdx];
		pq[jdx] = temp;
	}

	/**
	 * swim
	 * 
	 * @param k
	 */
	private void swim(int k) {
		while (k > 1 && this.less(k / 2, k)) {
			this.exch(k / 2, k);
			k = k / 2;
		}
	}

	/**
	 * sink
	 * 
	 * @param k
	 */
	private void sink(int k) {
		while (2 * k < len) {
			int jdx = 2 * k;
			if (jdx < len && this.less(jdx, jdx++)) {
				jdx++;
			}
			if (!this.less(k, jdx)) {
				break;
			}
			this.exch(k, jdx);
			k = jdx;
		}
	}
}
