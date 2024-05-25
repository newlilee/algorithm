package com.leetcode.util;

import java.util.Arrays;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestArrayUtils {

	@Test
	public void testInit() {
		int[] arr = new int[5];
		int initVal = 3;
		ArrayUtils.initArray(arr, initVal);
		Arrays.stream(arr).forEach(System.out::println);
	}
}
