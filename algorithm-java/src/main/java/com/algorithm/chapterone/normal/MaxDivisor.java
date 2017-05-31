package com.algorithm.chapterone.normal;

/**
 * @author chenlixin at 2016年3月28日 上午11:59:56
 */
public class MaxDivisor {

    public static int greatCommonDivisor(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return greatCommonDivisor(q, r);
    }

    public static void main(String[] args) {
        System.out.println(MaxDivisor.greatCommonDivisor(7, 3));
    }

}
