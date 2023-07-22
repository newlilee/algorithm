package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * leetcode.252
 * 给定一个会议时间安排的数组 intervals,每个会议时间都会包括开始和结束的时间 intervals[i] = [starti, endi],
 * 请你判断一个人是否能够参加这里面的全部会议。
 *
 * @author clx
 */
public class AttendMeetings {

	public static boolean attendMeetings(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return false;
		}

		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		for (int idx = 1; idx < intervals.length; idx++) {
			if (intervals[idx][0] < intervals[idx - 1][1]) {
				return false;
			}
		}
		return true;
	}
}
