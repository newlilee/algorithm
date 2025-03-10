package com.algorithm.funny.algorithm;

import org.testng.annotations.Test;

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

	@Test
	public void testFibonacciOptimize() {
		int n = 10;
		int result = FibonacciSequence.fibonacciOptimize(n);
		System.out.println("result:" + result);
	}
}
