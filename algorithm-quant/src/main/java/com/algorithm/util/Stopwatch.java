package com.algorithm.util;

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
	/**
	 * startNanoTime
	 */
	private final long startNanoTime;

	public Stopwatch() {
		this.startTime = System.currentTimeMillis();
		this.startNanoTime = System.nanoTime();
	}

	/**
	 * elapsed seconds time
	 *
	 * @return
	 */
	public double elapsedSecondTime() {
		long now = System.currentTimeMillis();
		return (now - startTime) / 1000.0;
	}

	/**
	 * elapsed millis time
	 *
	 * @return
	 */
	public double elapsedMillisTime() {
		long now = System.currentTimeMillis();
		return now - startTime;
	}

	/**
	 * elapsed nanoTime
	 *
	 * @return
	 */
	public long elapsedNanoTime() {
		long now = System.nanoTime();
		return now - startNanoTime;
	}
}
