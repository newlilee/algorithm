package com.algorithm.chapterone.normal.fourth;

/**
 * stopwatch
 * 
 * @author clx 2018/5/9.
 */
public class Stopwatch {
	/**
	 * startTime
	 */
	private final long startTime;

	public Stopwatch() {
		this.startTime = System.currentTimeMillis();
	}

	/**
	 * elapsed time
	 * 
	 * @return
	 */
	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - startTime) / 1000.0;
	}
}
