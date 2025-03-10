package com.leetcode.dynamic.programing;

/**
 * 509.fibonacci number
 *
 * @author clx
 */
public class FibonacciNumber {

	/**
	 * fibonacci use recursive
	 *
	 * @param n
	 * @return
	 */
	public static long fibonacciByRecursive(int n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciByRecursive(n - 1) + fibonacciByRecursive(n - 2);
	}

	/**
	 * fibonacci with reminder & recursive
	 *
	 * @param n
	 * @return
	 */
	public static long fibonacciWithReminder(int n) {
		if (n < 0) {
			return 0;
		}
		long[] reminder = new long[n + 1];
		return reminderRecursive(reminder, n);
	}

	/**
	 * fibonacci with reminder helper
	 *
	 * @param reminder reminder table
	 * @param n
	 * @return
	 */
	private static long reminderRecursive(long[] reminder, int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (reminder[n] != 0) {
			return reminder[n];
		}
		reminder[n] = reminderRecursive(reminder, n - 1) + reminderRecursive(reminder, n - 2);
		return reminder[n];
	}

	/**
	 * fibonacci use dp-table & loop
	 *
	 * @param n
	 * @return
	 */
	public static long fibonacciByDynamicPrograming(int n) {
		if (n == 0) {
			return 0;
		}
		long[] fibonacci = new long[n + 1];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		fibonacci[2] = 1;
		for (int idx = 3; idx <= n; idx++) {
			fibonacci[idx] = fibonacci[idx - 1] + fibonacci[idx - 2];
		}
		return fibonacci[n];
	}

	/**
	 * fibonacci without dp-table
	 *
	 * @param n
	 * @return
	 */
	public static long fibonacciWithoutDp(int n) {
		if (n == 0) {
			return 0;
		}
		long sum = 0;
		long prev = 1;
		long curr = 1;
		for (int idx = 3; idx <= n; idx++) {
			sum = curr + prev;
			prev = curr;
			curr = sum;
		}
		return sum;
	}
}
