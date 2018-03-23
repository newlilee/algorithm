package com.algorithm.funny.algorithm;

/**
 * Base 128 Varints
 * 
 * @author clx 2018/3/23.
 */
public class Varint {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Double.valueOf(Math.pow(2, 31) - 1).intValue());
		System.out.println(Double.valueOf(Math.pow(2, 29)).intValue());
		System.out.println(Math.pow(2, 15) - 1);
		System.out.println(Integer.toBinaryString(Double.valueOf(Math.pow(2, 15)).intValue() - 1));
		System.out.println(0xFF);
		System.out.println(Integer.toBinaryString(255));
	}

	/**
	 * 以可变字节写int值
	 * 
	 * @return
	 */
	public static int writeOptimizeInt() {

		return -1;
	}
}
