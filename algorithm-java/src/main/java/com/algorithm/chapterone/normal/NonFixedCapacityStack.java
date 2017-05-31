package com.algorithm.chapterone.normal;

/**
 * Non fixed capacity stack with gerneric
 * 
 * @author chenlixin at 2017年3月2日 上午11:21:57
 */
public class NonFixedCapacityStack<Item> {

    private Item[] array;
    private int len;

    public NonFixedCapacityStack(int cap) {
        array = (Item[]) new Object[cap];
    }

    public void push(Item item) {
        if (isFull()) {
            resize(2 * array.length);
        }
        array[len++] = item;
    }

    public Item pop() {
        Item item = array[--len];
        array[len] = null;
        if (len > 0 && len == array.length / 4) {
            resize(array.length / 2);
        }
        return item;
    }

    public boolean isEmpty() {
        return len == 0;
    }

    public boolean isFull() {
        return array.length == len;
    }

    public int size() {
        return len;
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int index = 0; index < len; index++) {
            temp[index] = array[index];
        }
        array = temp;
    }
}
