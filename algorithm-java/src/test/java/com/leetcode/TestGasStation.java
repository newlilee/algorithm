package com.leetcode;

import org.junit.jupiter.api.Test;

/**
 * @author clx
 */
public class TestGasStation {


	@Test
	public void testGasStationBruteForce() {
		int[] gas = {1, 2, 3, 4, 5};
		int[] cost = {3, 4, 5, 1, 2};
		int result = GasStation.canCompleteCircuitBruteForce(gas, cost);
		System.out.println("result:" + result);
	}

	@Test
	public void testGasStation() {
		int[] gas = {1, 2, 3, 4, 5};
		int[] cost = {3, 4, 5, 1, 2};
		int result = GasStation.canCompleteCircuit(gas, cost);
		System.out.println("result:" + result);
	}
}
