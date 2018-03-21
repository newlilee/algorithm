package com.algorithm.chapterone.normal.first;

import java.util.Arrays;

/**
 * array's normal method
 * 
 * @author clx 2018/1/9 6:19
 */
public class ArrayNormalMethod {

	public static void main(String[] args) {
		double[] array = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("max:" + max(array));
		System.out.println("average:" + average(array));
		System.out.println("copyArray:" + Arrays.toString(copyArray(array)));
		System.out.println("reverseArray:" + Arrays.toString(reverseArray(array)));

		double[][] firstArray = new double[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		double[][] secondArray = new double[][] { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };
		System.out.println("matrixMultiply:" + printArray(matrixMultiply(firstArray, secondArray)));
	}

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
		return array;
	}

	/**
	 * matrix multiply
	 * 
	 * @param firstArray
	 * @param secondArray
	 * @return
	 */
	private static double[][] matrixMultiply(double[][] firstArray, double[][] secondArray) {
		if (firstArray == null || firstArray.length == 0) {
			return null;
		}
		if (secondArray == null || secondArray.length == 0) {
			return null;
		}
		if (firstArray.length != secondArray.length) {
			return null;
		}
		int len = firstArray.length;
		double[][] resultArray = new double[len][len];
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				for (int k = 0; k < len; k++) {
					resultArray[i][j] += firstArray[i][k] * secondArray[k][j];
				}
			}
		}
		return resultArray;
	}

	/**
	 * print array
	 * 
	 * @param array
	 * @return
	 */
	private static String printArray(double[][] array) {
		if (array == null) {
			return null;
		}
		int iMax = array.length - 1;
		if (iMax == -1) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder();
		builder.append('[');
		for (int idx = 0;; idx++) {
			builder.append(Arrays.toString(array[idx]));
			if (idx == iMax) {
				return builder.append(']').toString();
			}
			builder.append(", ");
		}
	}
}
