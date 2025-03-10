package com.algorithm.funny.algorithm;

import java.util.Map;

/**
 * 爬楼梯问题，动态规划：<br/>
 * 要点： <br/>
 * 1.最优子结构 <br/>
 * F(10) = F(9) + F(8) <br/>
 * 2.边界 <br/>
 * F(1) =1, F(2) = 2 <br/>
 * 3.状态转移公式 <br/>
 * F(n) = F(n - 1) + F(n - 2)
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

	/**
	 * final version
	 * 
	 * @param n
	 * @return
	 */
	public static int climbingWays(int n) {
		if (n < 1) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		int firstVal = 1;
		int secondVal = 2;
		int temp = 0;
		for (int idx = 3; idx <= n; idx++) {
			temp = firstVal + secondVal;
			firstVal = secondVal;
			secondVal = temp;
		}
		return temp;
	}
}
