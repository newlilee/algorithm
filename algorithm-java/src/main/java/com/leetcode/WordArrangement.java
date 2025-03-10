package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode.49 给你一个字符串数组，请你将字母异位词组合在一起。可以按任意顺序返回结果列表。
 * <p>
 * 字母异位词是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 *
 * @author clx
 */
public class WordArrangement {

	/**
	 * @param strs string
	 * @return word arrangement array
	 */
	public static List<List<String>> wordArrangement(String[] strs) {
		if (strs == null || strs.length == 0) {
			return new ArrayList<>();
		}
		Map<String, List<String>> resultMap = new HashMap<>();
		for (String str : strs) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			resultMap.computeIfAbsent(new String(chars), k -> new ArrayList<>()).add(str);
		}
		return new ArrayList<>(resultMap.values());
	}
}
