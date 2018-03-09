package com.algorithm.chapterone.normal;

import edu.princeton.cs.algs4.StdIn;

/**
 * @author chenlixin at 2017年2月22日 上午11:57:20
 */
public class Evaluate {

	/**
	 * two stack calculate expression's value
	 */
	public static void calculate() {
		Stack<String> ops = new Stack<String>();
		Stack<Double> vals = new Stack<Double>();
		while (!StdIn.isEmpty()) {
			String str = StdIn.readString();
			if (str.equals("(")) {
			} else if (str.equals("+")) {
				ops.push(str);
			} else if (str.equals("-")) {
				ops.push(str);
			} else if (str.equals("*")) {
				ops.push(str);
			} else if (str.equals("/")) {
				ops.push(str);
			} else if (str.equals("sqrt")) {
				ops.push(str);
			} else if (str.equals(")")) {
				String op = ops.pop();
				Double v = vals.pop();
				if (op.equals("+")) {
					v = vals.pop() + v;
				} else if (op.equals("-")) {
					v = vals.pop() - v;
				} else if (op.equals("*")) {
					v = vals.pop() * v;
				} else if (op.equals("/")) {
					v = vals.pop() / v;
				} else if (op.equals("sqrt")) {
					v = Math.sqrt(v);
				}
			} else {
				vals.push(Double.parseDouble(str));
			}
		}
	}

	public static void main(String[] args) {

	}
}
