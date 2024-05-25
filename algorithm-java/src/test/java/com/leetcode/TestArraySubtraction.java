package com.leetcode;

import org.testng.annotations.Test;

/**
 * @author clx
 */
public class TestArraySubtraction {

	@Test
	public void testArraySubtraction() {
		char[] firstArr = { 'a', 'c', 'd', 'f', 'g' };
		char[] secondArr = { 'a', 'c', 'd', 'g' };
		char result = ArraySubtraction.arraySubtraction(firstArr, secondArr);
		System.out.println("result:" + result);
	}

	@Test
	public void testArraySubtractionWithBit() {
		char[] firstArr = { 'a', 'c', 'd', 'f', 'g' };
		char[] secondArr = { 'a', 'c', 'd', 'g' };
		char result = ArraySubtraction.arraySubtractionWithBit(firstArr, secondArr);
		System.out.println("result:" + result);
	}

	@Test
	public void testArraySub() {
		char[] firstArr = { 'a', 'c', 'd', 'f', 'g' };
		char[] secondArr = { 'a', 'c', 'd', 'g' };
		long start = System.nanoTime();
		ArraySubtraction.arraySubtraction(firstArr, secondArr);
		long end = System.nanoTime();
		System.out.println("arraySubtraction elapsed time:" + (end - start));
		ArraySubtraction.arraySubtractionWithBit(firstArr, secondArr);
		System.out.println("arraySubtractionWithBit elapsed time:" + (System.nanoTime() - end));
	}
}
