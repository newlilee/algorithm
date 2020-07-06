package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * N queens
 *
 * @author clx
 */
public class NQueens {

	public static List<String[][]> solveNQueens(int n) {
		List<String[][]> res = new ArrayList<>();
		String[][] board = new String[n][n];
		IntStream.range(0, n).forEach(idx -> IntStream.range(0, n).forEach(jdx -> board[idx][jdx] = "."));
		backtrack(res, board, 0);
		return res;
	}

	private static void backtrack(List<String[][]> result, String[][] board, int row) {
		if (row == board.length) {
			result.add(board);
			return;
		}

		int n = board[row].length;
		for (int col = 0; col < n; col++) {
			if (!isValid(board, row, col)) {
				continue;
			}
			board[row][col] = "Q";
			backtrack(result, board, row + 1);
			board[row][col] = ".";
		}
	}

	private static boolean isValid(String[][] board, int row, int col) {
		int n = board.length;
		for (String[] strings : board) {
			if (strings[col].equals("Q")) {
				return false;
			}
		}

		for (int idx = row - 1, jdx = col + 1; idx >= 0 && jdx < n; idx--, jdx++) {
			if (board[idx][jdx].equals("Q")) {
				return false;
			}
		}

		for (int idx = row - 1, jdx = col - 1; idx >= 0 && jdx >= 0; idx--, jdx--) {
			if (board[idx][jdx].equals("Q")) {
				return false;
			}
		}
		return true;
	}
}
