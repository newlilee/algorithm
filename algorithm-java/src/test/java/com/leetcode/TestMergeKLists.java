package com.leetcode;

import com.leetcode.common.ListNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

	@Test
	public void testMerge() {
		ListNode[] listNodes = new ListNode[2];
		for (int idx = 0; idx < 2; idx++) {
			ListNode list = new ListNode(new Random().nextInt(100));
			list.setNext(new Random().nextInt(100)).setNext(new Random().nextInt(100));
			listNodes[idx] = list;
			System.out.println(list);
		}
		ListNode result = MergeKLists.mergePriorityQueue(listNodes);
		System.out.println(result);
	}
}
