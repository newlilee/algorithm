package com.algorithm.chaptertwo.sort.first;

import com.algorithm.chaptertwo.sort.util.SortUtils;

/**
 * @author clx 2018/7/2.
 */
public class SelectionSort {

    /**
     * selection sort
     *
     * @param array
     */
    public static void sort(Comparable<Integer>[] array) {
        if (SortUtils.checkArrayValid(array)) {
            return;
        }
        int length = array.length;
        int minIdx;
        for (int idx = 0; idx < length; idx++) {
            minIdx = idx;
            for (int jdx = idx + 1; jdx < length; jdx++) {
                if (SortUtils.less(array[jdx], array[minIdx])) {
                    minIdx = jdx;
                }
            }
            SortUtils.exchange(array, idx, minIdx);
        }
    }
}
