package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

/**
 * @author clx 4/22/2019
 */
public class TestMergeKLists {

	@Test
	public void testMergeBruteForce() {
		List<List<Integer>> lists = new ArrayList<>();
		for (int idx = 0; idx < 10; idx++) {
			List<Integer> list = new ArrayList<>(10);
			for (int jdx = 0; jdx < 10; jdx++) {
				list.add(new Random().nextInt(100));
			}
			lists.add(list);
		}
		System.out.println(lists);
		List<Integer> retList = MergeKLists.mergeBruteForce(lists);
		System.out.println(retList);
	}
}
