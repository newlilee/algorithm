package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * merge k lists leetCode's 23
 * 
 * @author clx 4/22/2019
 */
public class MergeKLists {

	/**
	 * merge brute force
	 * 
	 * @param lists
	 * @return
	 */
	public static List<Integer> mergeBruteForce(List<List<Integer>> lists) {
		if (lists == null || lists.size() == 0) {
			return Collections.emptyList();
		}
		List<Integer> retList = new ArrayList<>();
		for (List<Integer> val : lists) {
			retList.addAll(val);
		}
		Collections.sort(retList);
		return retList;
	}



}
