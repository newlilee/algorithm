package com.algorithm.chaptertwo.sort.util;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author clx 2016年4月18日 下午10:39:59
 */
public final class SortUtils {
    private SortUtils() {

    }

    /**
     * sort method
     *
     * @param array
     */
    public static void sort(Comparable<Integer>[] array) {

    }

    /**
     * compare sorted
     *
     * @param v
     * @param w
     * @return
     */
    public static boolean less(Comparable<Integer> v, Comparable<Integer> w) {
        return v.compareTo((Integer) w) < 0;
    }

    /**
     * exchange element
     *
     * @param array
     * @param i
     * @param j
     */
    public static void exchange(Comparable<Integer>[] array, int i, int j) {
        Comparable<Integer> temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * print array
     *
     * @param array
     */
    public static void printArray(Comparable<Integer>[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }
        for (Comparable<Integer> ele : array) {
            StdOut.print(ele + " ");
        }
        StdOut.println();
    }

    /**
     * judge array is or not sorted
     *
     * @param array
     * @return
     */
    public static boolean isSorted(Comparable<Integer>[] array) {
        if (checkArrayValid(array)) {
            return false;
        }

        for (int i = 1; i < array.length; i++) {
            if (SortUtils.less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    /**
     * enhance sorted test
     *
     * @param array
     * @return
     */
    public static boolean isSortedEnhance(Comparable<Integer>[] array) {
        if (checkArrayValid(array)) {
            return false;
        }

        int count = 0;
        for (int idx = 1; idx < array.length; idx++) {
            Comparable<Integer> key = array[idx];
            int jdx = idx - 1;
            while (jdx >= 0 && less(key, array[jdx])) {
                array[jdx + 1] = array[jdx];
                jdx--;
                count++;
            }
            array[jdx + 1] = key;
        }
        return count == 0;
    }

    /**
     * array is valid <br/> return true if invalid, return false if valid
     *
     * @param array
     */
    public static boolean checkArrayValid(Comparable<Integer>[] array) {
        return array == null || array.length == 0;
    }
}
