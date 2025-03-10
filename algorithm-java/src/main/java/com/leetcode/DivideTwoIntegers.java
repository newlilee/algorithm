package com.leetcode;

/**
 * 29. Divide Two Integers
 *
 * @author clx
 */
public class DivideTwoIntegers {

	/**
	 * compute two Integer divide
	 *
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static int divide(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE || dividend == -1) {
			return Integer.MAX_VALUE;
		}
		if (Math.abs(divisor) == 1) {
			return divisor > 0 ? dividend : -dividend;
		}
		int dividendAbs = Math.abs(dividend);
		int divisorAbs = Math.abs(divisor);
		int result = 0;
		int sign = dividend > 0 ^ divisor > 0 ? -1 : 1;
		while (divisorAbs <= dividendAbs) {
			int count = 1;
			int shiftDivisor = divisorAbs;
			while (shiftDivisor << 1 <= dividendAbs) {
				shiftDivisor <<= 1;
				count <<= 1;
			}
			dividendAbs -= shiftDivisor;
			result += count;
		}
		return sign * result;
	}
}
