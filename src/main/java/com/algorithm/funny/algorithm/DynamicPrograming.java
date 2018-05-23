package com.algorithm.funny.algorithm;

import java.util.Map;

/**
 * 动态规划：<br/>
 * 要点： 1.最优子结构 2.边界 3.状态转移公式
 * 
 * @author clx 2018/5/22
 */
public class DynamicPrograming {

	/**
	 * 走台阶，一次走1步或2步
	 * 
	 * @param n
	 * @return
	 */
	public static int getClimbingWays(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return getClimbingWays(n - 1) + getClimbingWays(n - 2);
	}

	/**
	 * 备忘录算法
	 * 
	 * @param n
	 * @param stepMap
	 * @return
	 */
	public static int getClimbingWays(int n, Map<Integer, Integer> stepMap) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (stepMap.containsKey(n)) {
			return stepMap.get(n);
		} else {
			int value = getClimbingWays(n - 1) + getClimbingWays(n - 2);
			stepMap.put(n, value);
			return value;
		}
	}
}
