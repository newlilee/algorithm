package com.algorithm.funny.algorithm;

/**
 * @author clx
 */
public class FibonacciSequence {

	/**
	 * fibonacci recursive
	 *
	 * @param n
	 * @return
	 */
	public static int fibonacciByRecursive(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciByRecursive(n - 1) + fibonacciByRecursive(n - 2);
	}

	/**
	 * fibonacci dynamic programing
	 *
	 * @param n
	 * @return
	 */
	public static int fibonacciByDynamicPrograming(int n) {
		if (n == 0) {
			return 0;
		}
		int[] fibonacci = new int[n + 1];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		fibonacci[2] = 1;
		for (int idx = 3; idx <= n; idx++) {
			fibonacci[idx] = fibonacci[idx - 1] + fibonacci[idx - 2];
		}
		return fibonacci[n];
	}
}
