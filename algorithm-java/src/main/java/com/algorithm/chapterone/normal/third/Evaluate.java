package com.algorithm.chapterone.normal.third;

import edu.princeton.cs.algs4.StdIn;

/**
 * calculate expression's value
 * 
 * @author chenlixin at 2017年2月22日 上午11:57:20
 */
public class Evaluate {

	public static void main(String[] args) {
		Evaluate.calculate();
	}

	/**
	 * two stack calculate expression's value
	 */
	private static void calculate() {
		Stack<String> ops = new Stack<>();
		Stack<Double> values = new Stack<>();
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
				Double v = values.pop();
				if (op.equals("+")) {
					v = values.pop() + v;
				} else if (op.equals("-")) {
					v = values.pop() - v;
				} else if (op.equals("*")) {
					v = values.pop() * v;
				} else if (op.equals("/")) {
					v = values.pop() / v;
				} else if (op.equals("sqrt")) {
					v = Math.sqrt(v);
				}
				values.push(v);
			} else {
				values.push(Double.parseDouble(str));
			}
		}
	}
}
