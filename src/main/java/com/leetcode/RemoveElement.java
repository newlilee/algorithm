package com.leetcode;

import com.leetcode.util.ArrayUtils;

/**
 * 27. Remove Element
 *
 * @author clx
 */
public class RemoveElement {

	public static int removeElement(int[] array, int val) {
		if (ArrayUtils.checkArrayValid(array)) {
			return -1;
		}
		int count = 0;
		for (int idx = 1; idx < array.length; idx++) {
			if (val != array[idx]) {
				count++;
			}
		}
		return count + 1;
	}
}
