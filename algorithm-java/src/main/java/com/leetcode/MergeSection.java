package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.List;

/**
 * 56. 以数组intervals表示若干个区间的集合，其中单个区间为intervals[i] = [starti, endi]。
 * </p>
 * 请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
 *
 * @author clx
 */
public class MergeSection {

	/**
	 * merge with sort
	 *
	 * @param intervals arrays
	 * @return merged arrays
	 */
	public static int[][] mergeSection(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return new int[][] {};
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
			result.add(new int[] { intervals[idx][0], rightMax });
			idx = jdx;
		}
		return result.toArray(new int[][] {});
	}

	/**
	 * merge with sort
	 *
	 * @param intervals arrays
	 * @return merged arrays
	 */
	public static int[][] mergeWithSort(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return new int[][] {};
		}
		Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
		int[][] result = new int[intervals.length][2];
		int idx = -1;
		for (int[] interval : intervals) {
			if (idx == -1 || interval[0] > result[idx][1]) {
				result[++idx] = interval;
			} else {
				result[idx][1] = Math.max(result[idx][1], interval[1]);
			}
		}
		return Arrays.copyOf(result, idx + 1);
	}

	/**
	 * merge with bitset
	 *
	 * @param intervals arrays
	 * @return merged arrays
	 */
	public static int[][] mergeWithBitSet(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return new int[][] {};
		}
		BitSet bitSet = new BitSet();
		int max = 0;
		for (int[] interval : intervals) {
			int start = interval[0] * 2;
			int end = interval[1] * 2 + 1;
			max = Math.max(max, end);
			bitSet.set(start, end, true);
		}
		int count = 0;
		int idx = 0;
		while (idx < max) {
			int start = bitSet.nextSetBit(idx);
			int end = bitSet.nextClearBit(start);
			intervals[count++] = new int[] { start / 2, (end - 1) / 2 };
			idx = end;
		}
		int[][] result = new int[count][2];
		System.arraycopy(intervals, 0, result, 0, count);
		return result;
	}
}
