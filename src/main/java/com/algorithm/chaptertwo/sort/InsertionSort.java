package com.algorithm.chaptertwo.sort;

/**
 * @author clx 2016年4月24日 下午4:47:13
 */
public class InsertionSort {

    /**
     * exhange two element on every compare
     * 
     * @param array
     */
    @SuppressWarnings("rawtypes")
    public static void sort(Comparable[] array) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0
                    && ExampleUtils.less(array[j], array[j - 1]); j++) {
                ExampleUtils.exch(array, j, j - 1);
            }
        }
    }

    public static void sortEnhance(Comparable[] array) {
        int len = array.length;
        int j;
        for (int i = 1; i < len; i++) {
            Comparable tmp = array[i];
            for (j = i - 1; j >= 0 && ExampleUtils.less(tmp, array[j]); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[] { 5, 7, 6, 1, 4, 3, 2 };
        ExampleUtils.printArray(array);
        long startTime = System.nanoTime();
        InsertionSort.sortEnhance(array);
        System.out.println(System.nanoTime() - startTime);
        ExampleUtils.printArray(array);
    }
}
