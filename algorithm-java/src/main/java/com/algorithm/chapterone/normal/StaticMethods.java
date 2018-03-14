package com.algorithm.chapterone.normal;

/**
 * @author clx 2018/3/13.
 */
public class StaticMethods {

	public static void main(String[] args) {
		System.out.println("abs:" + abs(-2));
		System.out.println("abs:" + abs(0.0));
		System.out.println("isPrime:" + isPrime(4));
		System.out.println("sqrt:" + sqrt(4));
		System.out.println("hypotenuse:" + hypotenuse(3, 4));
		System.out.println("harmonicSeries:" + harmonicSeries(3));
	}

	/**
	 * int abs
	 * 
	 * @param target
	 * @return
	 */
	private static int abs(int target) {
		if (target == 0) {
			return target;
		}
		if (target < 0) {
			return -target;
		} else {
			return target;
		}
	}

	/**
	 * double target
	 * 
	 * @param target
	 * @return
	 */
	private static double abs(double target) {
		if (target == 0) {
			return target;
		}
		if (target < 0) {
			return -target;
		} else {
			return target;
		}
	}

	/**
	 * prime number
	 * 
	 * @param target
	 * @return
	 */
	private static boolean isPrime(int target) {
		if (target < 2) {
			return false;
		}
		for (int idx = 2; idx * idx < target; idx++) {
			if (target % idx == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * sqrt
	 * 
	 * @param target
	 * @return
	 */
	private static double sqrt(double target) {
		if (Double.isNaN(target) || target < 0) {
			return Double.NaN;
		}
		if (Double.isInfinite(target)) {
			return target;
		}
		double err = Math.pow(1, -15);
		double t = target;
		while (Math.abs(t - target / t) > err * t) {
			t = (target / t + t) / 2.0;
		}
		return t;
	}

	/**
	 * calculate hypotenuse
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static double hypotenuse(double a, double b) {
		return Math.sqrt(a * a + b * b);
	}

	/**
	 * 计算调和级数
	 * 
	 * @param num
	 * @return
	 */
	private static double harmonicSeries(int num) {
		double sum = 0.0;
		for (int idx = 1; idx <= num; idx++) {
			sum += 1.0 / idx;
		}
		return sum;
	}
}
