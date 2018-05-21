package com.algorithm.practice.chapterone.first;

import org.apache.commons.lang3.StringUtils;

/**
 * print value
 * 
 * @author chenlixin at 2016年4月25日 下午1:29:31
 */
public class PrintValue {

	public static void main(String[] args) {
		// 1.1.1
		System.out.println((0 + 15) / 2);
		System.out.println(2.0 * Math.E - 6 * 1000000000.1);
		System.out.println(true && false || true && true);

		// 1.1.2
		System.out.println((1 + 2.236) / 2);
		System.out.println(1 + 2 + 3 + 4.0);
		System.out.println(4.1 >= 4);
		System.out.println(1 + 2 + "3");
		System.out.println(1 + 2 + '3');

		// 1.1.5
		System.out.println(compareDoubleVal(0.9, 0.5));

		// 1.1.6
		int f = 0;
		int g = 1;
		for (int idx = 0; idx <= 15; idx++) {
			System.out.println(f);
			f = f + g;
			g = f - g;
		}

		// 1.1.7
		double t = 9.0;
		while (Math.abs(t - 9.0 / t) > .001) {
			t = (9.0 / t + t) / 2.0;
		}
		System.out.printf("%.5f\n", t);

		int sum = 0;
		for (int idx = 1; idx <= 5; idx++) {
			for (int j = 0; j < idx; j++) {
				sum++;
			}
		}
		System.out.println(sum);

		int result = 0;
		for (int idx = 1; idx < 1000; idx *= 2) {
			for (int j = 0; j < 1000; j++) {
				result++;
			}
		}
		System.out.println(result);

		// 1.1.8
		System.out.println('B');
		System.out.println('b' + 'c');
		System.out.println((char) ('a' + 4));

		// 1.1.9
		System.out.println("self:" + toBinaryString(-5));
		System.out.println("java:" + Integer.toBinaryString(-5));
	}

	/**
	 * 1.1.5
	 * 
	 * @param x
	 * @param y
	 * @return
	 */
	private static boolean compareDoubleVal(double x, double y) {
		if (x > 0 && x < 1) {
			if (y > 0 && y < 1) {
				return true;
			}
			return false;
		}
		return false;
	}

	/**
	 * 1.1.9
	 * 
	 * @param target
	 * @return
	 */
	private static String toBinaryString(int target) {
		if (target > Integer.MAX_VALUE || target < Integer.MIN_VALUE) {
			return null;
		}
		if (target == 0) {
			return "0";
		}
		StringBuilder result = new StringBuilder(32);
		if (target > 0) {
			for (int idx = target; idx > 0; idx /= 2) {
				result.append(idx % 2);
			}
			return result.reverse().toString();
		}
		if (target < 0) {
			target = -target;
			for (int idx = target; idx > 0; idx /= 2) {
				result.append(idx % 2);
			}
			result.reverse();
			char[] chars = new char[32];
			int idx = 0;
			while (idx < (chars.length - result.length())) {
				chars[idx] = '0';
				idx++;
			}
			result.getChars(0, result.length(), chars, idx);
			char[] againstChars = new char[32];
			for (int i = 0; i < chars.length; i++) {
				switch (chars[i]) {
				case '0':
					againstChars[i] = '1';
					break;
				case '1':
					againstChars[i] = '0';
					break;
				default:
					againstChars[i] = ' ';
					break;
				}
			}
			String binaryString = new String(againstChars);
			int lastIdx = StringUtils.lastIndexOf(binaryString, '0');
			if (lastIdx != -1) {
				result.append(StringUtils.substring(binaryString, 0, lastIdx));
				String replaceString = StringUtils.substring(binaryString, lastIdx, binaryString.length());
				replaceString = StringUtils.replace(replaceString, "0", "1");
				replaceString = StringUtils.replace(replaceString, "1", "0");
				result.append(replaceString);
			} else {
				result = result.append('1').append(
						StringUtils.replace(StringUtils.substring(binaryString, 1, binaryString.length()), "1", "0"));
			}
			return result.toString();
		}
		return null;
	}
}
