package com.algorithm.sort;

/**
 * @author chenlixin at 2016年4月28日 下午2:46:18
 */
public class ShellSort {

    public static void sort(Comparable[] array) {
        int len = array.length;
        int h = 1;
        while (h < len / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < len; i++) {
                for (int j = i; j >= h
                        && ExampleUtils.less(array[j], array[j - h]); j -= h) {
                    ExampleUtils.exch(array, j, j - h);
                }
            }
            h = h / 3;
        }

    }
}
