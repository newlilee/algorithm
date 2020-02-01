package com.leetcode;

import com.leetcode.util.SortUtils;

/**
 * 26. Remove Duplicates from Sorted Array
 *
 * @author clx
 */
public class RemoveDuplicates {

	public static int removeDuplicates(int[] array) {
		if (SortUtils.checkArrayValid(array)) {
			return -1;
		}
		for (int idx = 0; idx < array.length; idx++) {
			int currEle = array[idx];
			for (int jdx = idx + 1; jdx < array.length; jdx++) {
				int nextEle = array[jdx];
				if (currEle == nextEle) {
					
				}
			}
		}
		return array.length;
	}
}
