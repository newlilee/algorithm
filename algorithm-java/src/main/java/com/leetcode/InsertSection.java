package com.leetcode;

import java.util.Arrays;

/**
 * leetcode.57 给你一个 无重叠的 ，按照区间起始端点排序的区间列表。
 * <p>
 * 在列表中插入一个新的区间，你需要确保列表中的区间仍然有序且不重叠（如果有必要的话，可以合并区间）。
 *
 * @author clx
 */
public class InsertSection {

	public static int[][] insertSection(int[][] intervals, int[] newInterval) {
		if (intervals == null || intervals.length == 0) {
			return new int[][] { newInterval };
		}
		if (newInterval == null || newInterval.length == 0) {
			return intervals;
		}
		int[][] result = new int[intervals.length + 1][2];
		// intervals index
		int idx = 0;
		// result index
		int jdx = 0;
		while (idx < intervals.length && intervals[idx][1] < newInterval[0]) {
			result[jdx++] = intervals[idx++];
		}
		while (idx < intervals.length && intervals[idx][0] <= newInterval[1]) {
			newInterval[0] = Math.min(intervals[idx][0], newInterval[0]);
			newInterval[1] = Math.max(intervals[idx][1], newInterval[1]);
			idx++;
		}
		result[jdx++] = newInterval;
		while (idx < intervals.length) {
			result[jdx++] = intervals[idx++];
		}
		return Arrays.copyOf(result, jdx);
	}
}
