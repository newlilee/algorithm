package com.algorithm.normal.chapterone;

import java.util.Iterator;

/**
 * @author chenlixin at 2017年3月8日 下午12:00:52
 */
public class LinkedQueue<Item> implements Iterable<Item> {

    /**
     * first element
     */
    private Node first;

    /**
     * last element
     */
    private Node last;

    /**
     * length of queue
     */
    private int len;

    /**
     * enqueue element
     * 
     * @param item
     */
    public void enqueue(Item item) {
        Node oldLast = last;
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldLast.next = last;
        }
        len++;
    }

    /**
     * dequeue element
     */
    public Item dequeue() {
        Item item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        len--;
        return item;
    }

    public boolean isEmpty() {
        return first == null;// len == 0;
    }

    public int size() {
        return len;
    }

    @Override
    public Iterator<Item> iterator() {
        // TODO Auto-generated method stub
        return null;
    }

    private class Node {
        Item item;
        Node next;
    }
}
