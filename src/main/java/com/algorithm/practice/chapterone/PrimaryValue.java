package com.algorithm.practice.chapterone;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author chenlixin at 2016年4月25日 下午1:29:31
 */
public class PrimaryValue {

    public static void main(String[] args) {
        // int f = 0;
        // int g = 1;
        // for (int i = 0; i <= 15; i++) {
        // System.out.println(f);
        // f = f + g;
        // g = f - g;
        // }

        // double t = 9.0;
        // while (Math.abs(t - 9.0/t) > .001)
        // t = (9.0/t + t) / 2.0;
        // StdOut.printf("%.5f\n", t);

        // int sum = 0;
        // for (int i = 1; i < 1000; i *= 2)
        // for (int j = 0; j < i; j++)
        // sum++;
        // StdOut.println(sum);
        // System.out.println(-2 ^ -3);
        // int a = -2;
        // System.out.println(Integer.toBinaryString(a));

        // System.out.println('b' + 'c');
        // String ret = toBinaryString(5);
        // System.out.println(Integer.valueOf(ret));

        // System.out.println(printSeries(10));

        // System.out.println(printMaxVal(4));
        System.out.println(~2);
        System.out.println(Integer.toBinaryString(~2));
    }

    public static String toBinaryString(int num) {
        String s = "";
        for (int i = num; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        return s;
    }

    public static void printMatrix() {

    }

    public static double printSeries(int N) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static int printMaxVal(int N) {
        int ret = 0;
        ret = N >> 2;
        return ret;
    }
}
