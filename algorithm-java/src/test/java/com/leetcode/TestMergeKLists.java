package com.leetcode;

import com.leetcode.common.ListNode;
import com.leetcode.util.Stopwatch;
import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @author clx 4/22/2019
 */
public class TestMergeKLists {

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
}
