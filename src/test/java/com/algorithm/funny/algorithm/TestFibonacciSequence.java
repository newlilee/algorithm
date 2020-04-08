package com.algorithm.funny.algorithm;

import org.junit.Test;

/**
 * @author clx
 */
public class TestFibonacciSequence {

	@Test
	public void testFibonacci() {
		int n = 10;
		int result = FibonacciSequence.fibonacciByRecursive(n);
		System.out.println("result:" + result);
	}

	@Test
	public void testFibonacciDynamicPrograming() {
		int n = 10;
		int result = FibonacciSequence.fibonacciByDynamicPrograming(n);
		System.out.println("result:" + result);
	}
}
