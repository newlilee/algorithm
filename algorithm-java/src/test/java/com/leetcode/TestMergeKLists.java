package com.leetcode;

import com.leetcode.common.ListNode;
import com.leetcode.util.Stopwatch;
import org.junit.jupiter.api.Test;

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
		Stopwatch stopwatch = new Stopwatch();
		List<Integer> retList = MergeKLists.mergeBruteForce(lists);
		System.out.println(stopwatch.elapsedNanoTime());
		System.out.println(retList);
	}

	@Test
	public void testMerge() {
		ListNode[] listNodes = new ListNode[10];
		for (int idx = 0; idx < 10; idx++) {
			ListNode list = new ListNode(new Random().nextInt(100));
			list.setNext(new Random().nextInt(100)).setNext(new Random().nextInt(100));
			listNodes[idx] = list;
		}
		Stopwatch stopwatch = new Stopwatch();
		ListNode result = MergeKLists.mergePriorityQueue(listNodes);
		System.out.println(stopwatch.elapsedNanoTime());
		System.out.println(result);
	}

	@Test
	public void testMergeCompare() {
		List<List<Integer>> lists = new ArrayList<>();
		for (int idx = 0; idx < 1000; idx++) {
			List<Integer> list = new ArrayList<>(1000);
			for (int jdx = 0; jdx < 1000; jdx++) {
				list.add(new Random().nextInt(1000));
			}
			lists.add(list);
		}
		Stopwatch stopwatch = new Stopwatch();
		List<Integer> retList = MergeKLists.mergeBruteForce(lists);
		System.out.println(stopwatch.elapsedNanoTime());
		System.out.println(retList);

		ListNode[] listNodes = new ListNode[1000];
		for (int idx = 0; idx < 1000; idx++) {
			ListNode list = new ListNode(new Random().nextInt(1000));
			list.setNext(new Random().nextInt(1000)).setNext(new Random().nextInt(1000));
			listNodes[idx] = list;
		}
		Stopwatch sw = new Stopwatch();
		ListNode result = MergeKLists.mergePriorityQueue(listNodes);
		System.out.println(sw.elapsedNanoTime());
		System.out.println(result);
	}
}
