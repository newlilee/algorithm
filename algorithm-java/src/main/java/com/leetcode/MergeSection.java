package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 56.
 * 以数组intervals表示若干个区间的集合，其中单个区间为intervals[i] = [starti, endi]。
 * </p>
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 * @author clx
 */
public class MergeSection {

	public static int[][] mergeSection(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return new int[][]{};
		}
		Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
		int len = intervals.length;
		List<int[]> result = new ArrayList<>();
		int idx = 0;
		while (idx < len) {
			int rightMax = intervals[idx][1];
			int jdx = idx + 1;
			while (jdx < len && intervals[jdx][0] <= rightMax) {
				rightMax = Math.max(rightMax, intervals[jdx][1]);
				jdx++;
			}
			result.add(new int[]{intervals[idx][0], rightMax});
			idx = jdx;
		}
		return result.toArray(new int[][]{});
	}
}
