package com.algorithm.chaptertwo.sort.first;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author clx 2016年4月18日 下午10:39:59
 */
public class ExampleUtils {

    /**
     * sort method
     * 
     * @param array
     */
    public static void sort(Comparable[] array) {

    }

    /**
     * compare sorted
     * 
     * @param v
     * @param w
     * @return
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * exchange element
     * 
     * @param array
     * @param i
     * @param j
     */
    public static void exch(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * print array
     * 
     * @param array
     */
    public static void printArray(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            StdOut.print(array[i] + " ");
        }
        StdOut.println();
    }

    /**
     * judge array is or not sorted
     * 
     * @param array
     * @return
     */
    public static boolean isSorted(Comparable[] array) {
        for (int i = 0; i < array.length; i++) {
            if (ExampleUtils.less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
