package com.algorithm.sort;

/**
 * @author chenlixin at 2016年4月25日 下午12:10:15
 */
public class SelectionSort {

    public static void sort(Comparable[] array) {
        int len = array.length;
        for(int i = 0 ; i < len; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (ExampleUtils.less(array[j], array[min])) {
                    min = j;
                }
            }
            ExampleUtils.exch(array, i, min);
        }
    }
    
    public static void main(String[] args) {
        Integer[] array = new Integer[]{ 5, 7, 6, 1, 4, 3, 2 };
        ExampleUtils.show(array);
        sort(array);
        ExampleUtils.show(array);
    }
}
