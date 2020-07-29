package com.leetcode;

/**
 * 134. Gas Station
 *
 * @author clx
 */
public class GasStation {

	/**
	 * @param gas
	 * @param cost
	 * @return
	 */
	public static int canCompleteCircuitBruteForce(int[] gas, int[] cost) {
		int total = 0;
		int sum = 0;
		int startIdx = 0;
		for (int idx = 0; idx < gas.length; idx++) {
			total += gas[idx] - cost[idx];
			sum += gas[idx] - cost[idx];
			if (sum < 0) {
				startIdx = idx + 1;
				sum = 0;
			}
		}
		return total < 0 ? -1 : startIdx;
	}

	/**
	 * @param gas
	 * @param cost
	 * @return
	 */
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int total = 0;
		int mx = -1;
		int startIdx = 0;
		for (int idx = gas.length - 1; idx >= 0; idx--) {
			total += gas[idx] - cost[idx];
			if (total > mx) {
				startIdx = idx;
				mx = total;
			}
		}
		return total < 0 ? -1 : startIdx;
	}
}
