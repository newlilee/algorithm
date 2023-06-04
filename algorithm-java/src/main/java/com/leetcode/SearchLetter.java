package com.leetcode;

/**
 * 79.
 * 给定一个m x n 二维字符网格board 和一个字符串单词word。如果word 存在于网格中，返回 true;否则，返回 false。
 * <p>
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * @author clx
 */
public class SearchLetter {

	public static boolean exist(char[][] board, String word) {
		for (int idx = 0; idx < board.length; idx++) {
			for (int jdx = 0; jdx < board[0].length; jdx++) {
				if (dfs(board, word, 0, idx, jdx)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfs(char[][] board, String word, int index, int idx, int jdx) {
		if (idx < 0 || idx > board.length - 1
				|| jdx < 0 || jdx > board[0].length - 1
				|| board[idx][jdx] == '.' || board[idx][jdx] != word.charAt(index)) {
			return false;
		}
		if (index == word.length() - 1) {
			return true;
		} else {
			char boardLetter = board[idx][jdx];
			board[idx][jdx] = '.';
			boolean result = dfs(board, word, index + 1, idx + 1, jdx)
					|| dfs(board, word, index + 1, idx - 1, jdx)
					|| dfs(board, word, index + 1, idx, jdx + 1)
					|| dfs(board, word, index + 1, idx, jdx - 1);
			board[idx][jdx] = boardLetter;
			return result;
		}
	}
}
