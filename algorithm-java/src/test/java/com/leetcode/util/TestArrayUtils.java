package com.leetcode.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author clx
 */
public class TestArrayUtils {

	@Test
	public void testInit() {
		int[] arr = new int[5];
		int initVal = 1;
		ArrayUtils.initArray(arr, initVal);
		Arrays.stream(arr).forEach(System.out::println);
	}
}
