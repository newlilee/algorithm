package com.algorithm.chapterone.normal;

/**
 * @author clx 2018/1/9 6:19
 */
public class BasicStruct {

	/**
	 * array's max element
	 *
	 * @param array
	 * @return
	 */
	private static double max(double[] array) {
		double max = array[0];
		for (int idx = 1; idx < array.length; idx++) {
			if (array[idx] > max) {
				max = array[idx];
			}
		}
		return max;
	}

	/**
	 * array's average value
	 *
	 * @param array
	 * @return
	 */
	private static double average(double[] array) {
		int len = array.length;
		if (len == 0) {
			return 0;
		}
		double sum = 0;
		for (int idx = 0; idx < len; idx++) {
			sum += array[idx];
		}
		return sum / len;
	}

	/**
	 * copy array
	 *
	 * @param array
	 * @return
	 */
	private static double[] copyArray(double[] array) {
		int len = array.length;
		double[] ret = new double[len];
		for (int idx = 0; idx < len; idx++) {
			ret[idx] = array[idx];
		}
		return ret;
	}

	/**
	 * reverse array
	 *
	 * @param array
	 * @return
	 */
	private static double[] reverseArray(double[] array) {
		int len = array.length;
		for (int idx = 0; idx < len / 2; idx++) {
			double temp = array[idx];
			array[idx] = array[len - idx - 1];
			array[len - idx - 1] = temp;
		}
		return null;
	}

}
