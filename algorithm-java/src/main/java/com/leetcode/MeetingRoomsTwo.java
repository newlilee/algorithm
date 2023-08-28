package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * leetcode.253
 *
 * @author clx
 */
public class MeetingRoomsTwo {

	public static int minMeetingRooms(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return 0;
		}
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		PriorityQueue<Integer> meetingCount = new PriorityQueue<>();
		for (int[] interval : intervals) {
			if (!meetingCount.isEmpty() && interval[0] >= meetingCount.peek()) {
				meetingCount.poll();
			}
			meetingCount.offer(interval[1]);
		}
		return meetingCount.size();
	}
}
