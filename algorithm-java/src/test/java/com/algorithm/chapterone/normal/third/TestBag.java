package com.algorithm.chapterone.normal.third;

import java.util.Random;

/**
 * test bag
 * 
 * @author clx 2018/5/3.
 */
public class TestBag {

	private static Random random = new Random();

	public static void main(String[] args) {

		Bag<Integer> bag = new Bag<>();
		for (int idx = 0; idx < 500; idx++) {
			bag.add(random.nextInt());
		}
		System.out.println("Bag size:" + bag.size());
	}
}
