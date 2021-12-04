package com.leetcode.dynamic.programing;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestFibonacciNumber {

	@Test
	public void testFibonacciByRecursive() {
		int n = 20;
		int result = FibonacciNumber.fibonacciByRecursive(n);
		System.out.println("result:" + result);
	}

	@Test
	public void testFibonacciByDynamicPrograming() {
		int n = 20;
		int result = FibonacciNumber.fibonacciByDynamicPrograming(n);
		System.out.println("result:" + result);
	}

	@Test
	public void testFibonacciWithoutDp() {
		int n = 20;
		int result = FibonacciNumber.fibonacciWithoutDp(n);
		System.out.println("result:" + result);
	}
}
