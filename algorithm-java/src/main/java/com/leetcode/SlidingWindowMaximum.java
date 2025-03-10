package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

import com.leetcode.util.ArrayUtils;

/**
 * 239. Sliding Window Maximum Given an array nums, there is a sliding window of
 * size k which is moving from the very left of the array to the very right. You
 * can only see the k numbers in the window. Each time the sliding window moves
 * right by one position. Return the max sliding window.
 * <p>
 * Follow up: Could you solve it in linear time?
 *
 * @author clx
 */
public class SlidingWindowMaximum {

	/**
	 * use priority queue
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public static int[] maxSlidingWindowWithHeap(int[] nums, int k) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new int[] {};
		}
		if (k <= 1) {
			return nums;
		}

		Queue<Integer> q = new PriorityQueue<>(k, (o1, o2) -> o2 - o1);
		int[] result = new int[nums.length - k + 1];
		for (int idx = 0; idx < nums.length; idx++) {
			if (idx < k - 1) {
				q.add(nums[idx]);
			} else if (idx == k - 1) {
				q.add(nums[idx]);
				result[0] = q.peek();
			} else {
				q.remove(nums[idx - k]);
				q.add(nums[idx]);
				result[idx - k + 1] = q.peek();
			}
		}
		return result;
	}

	/**
	 * use deque
	 *
	 * @param nums
	 * @param k
	 * @return
	 */
	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (ArrayUtils.checkArrayValid(nums)) {
			return new int[] {};
		}
		if (k <= 1) {
			return nums;
		}

		int[] result = new int[nums.length - k + 1];
		Deque<Integer> q = new ArrayDeque<>();
		for (int idx = 0; idx < nums.length; idx++) {
			if (!q.isEmpty() && q.peekFirst() == idx - k) {
				q.removeFirst();
			}
			while (!q.isEmpty() && nums[q.peekLast()] < nums[idx]) {
				q.removeLast();
			}
			q.offerLast(idx);
			if (idx >= k - 1) {
				result[idx - k + 1] = nums[q.peek()];
			}
		}
		return result;
	}
}
