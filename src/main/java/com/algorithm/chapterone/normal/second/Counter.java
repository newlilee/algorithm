package com.algorithm.chapterone.normal.second;

/**
 * counter
 * 
 * @author clx 2018/3/21.
 */
public class Counter {

	/**
	 * id
	 */
	private String id;
	/**
	 * count
	 */
	private int count;

	public Counter(String id) {
		this.id = id;
	}

	/**
	 * increment
	 */
	public void increment() {
		count++;
	}

	/**
	 * tally
	 * 
	 * @return
	 */
	public int tally() {
		return count;
	}

	@Override
	public String toString() {
		return "Counter{" + "id='" + id + '\'' + ", count=" + count + '}';
	}
}
