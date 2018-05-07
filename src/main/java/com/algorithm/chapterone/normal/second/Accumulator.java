package com.algorithm.chapterone.normal.second;

/**
 * Accumulator
 * 
 * @author clx 2018/3/23.
 */
public class Accumulator {

	/**
	 * total
	 */
	private double total;
	/**
	 * count
	 */
	private int count;

	/**
	 * Accumulator
	 * 
	 * @param val
	 */
	public void addDeltaValue(double val) {
		count++;
		total += val;
	}

	/**
	 * average
	 * 
	 * @return average
	 */
	public double mean() {
		return total / count;
	}

	@Override
	public String toString() {
		return "Mean (" + count + ") values:" + String.format("%7.5f", this.mean());
	}
}
