package com.algorithm.chaptertwo.sort.forth;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

/**
 * @author clx 2/23/2018
 */
public class TestMaxPriorityQueue {

	@Test
	public void testMaxPQ() {
		int initCapacity = 6;
		MaxPriorityQueue pq = new MaxPriorityQueue(initCapacity);
		int time = 0;
		while (time < initCapacity) {
			int ele = new Random().nextInt(10);
			pq.insert(ele);
			time++;
		}
		System.out.println(Arrays.toString(pq.getPq()));
	}
}
