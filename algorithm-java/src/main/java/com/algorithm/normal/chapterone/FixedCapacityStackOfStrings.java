package com.algorithm.normal.chapterone;

/**
 * @author chenlixin at 2017年2月22日 下午6:49:13
 */
public class FixedCapacityStackOfStrings {

    /**
     * implement fixed capacity stack based on array
     */
    private String[] array;

    /**
     * stack len
     */
    private Integer len;

    public FixedCapacityStackOfStrings(Integer cap) {
        array = new String[cap];
    }

    /**
     * add an item
     * 
     * @param item
     */
    public void push(String item) {
        array[len++] = item;
    }

    /**
     * remove an item
     * 
     * @return
     */
    public String pop() {
        return array[--len];
    }

    /**
     * 
     * @return
     */
    public boolean isEmpty() {
        return len == null;
    }

    /**
     * size of stack
     * 
     * @return
     */
    public Integer size() {
        return len;
    }
}
