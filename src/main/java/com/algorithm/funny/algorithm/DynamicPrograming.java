package com.algorithm.funny.algorithm;

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
	public int steps(int n) {
		if (n <= 0) {
			return -1;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		return -1;
	}
}
