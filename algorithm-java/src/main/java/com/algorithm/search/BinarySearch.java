package com.algorithm.search;

/**
 * @author chenlixin at 2016年3月28日 上午11:07:02
 */
public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < array[mid]) {
                high = mid - 1;
            } else if (target > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归方式
     * @param key
     * @param array
     * @param low
     * @param high
     * @return
     */
    public static int rank(int key, int array[], int low, int high) {
        if (low > high) 
            return -1;
        int mid = low + (high -low) / 2;
        if (key < array[mid])
            return rank(key, array, low, mid - 1);
        else if (key > array[mid])
            return rank(key, array, mid + 1, high);
        else
            return mid;
    }
    
    public static void main(String[] args) {
        System.out.println(1 << 30);
    }
}
