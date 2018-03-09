package com.algorithm.chapterone.normal;

/**
 * basic programing model
 *
 * @author clx 2018/3/9.
 */
public class BasicModel {

	/**
	 * great common divisor
	 *
	 * @param p first number
	 * @param q second number
	 * @return p&q's gcd
	 */
	private static int gcd(int p, int q) {
		if (p < 0 || q < 0) {
			return -1;
		}
		if (q == 0) {
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}

	public static void main(String[] args) {
		System.out.println(BasicModel.gcd(6, 4));
	}
}
