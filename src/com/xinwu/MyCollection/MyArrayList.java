package com.xinwu.MyCollection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Xin'5 on 2017/10/1.
 */
public class MyArrayList implements Iterable<Integer> {
    private static final int DEFAULT_CAPACITY = 10;

    private int theSize;
    private Integer[] theItems;

    public MyArrayList() {
        doClear();
    }

    private void doClear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public int size() {
        return theSize;
    }

    public boolean isEmpty() {
        return theSize == 0;
    }

    public void trimToSize() {
        ensureCapacity( size() );
    }

    public Integer get(int idx) {
        if (idx<0 || idx>theSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return theItems[idx];
    }

    public Integer set(int idx, Integer newval) {
        if (idx<0 || idx>theSize) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Integer old = theItems[idx];
        theItems[idx] = newval;
        return old;
    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity<theSize) {
            return;
        }
        Integer[] old = theItems;
        theItems = (Integer[]) new Object[newCapacity];
        for (int i=0; i< size(); i++) {
            theItems[i] = old[i];
        }
    }

    public boolean add(Integer x) {
        add(size(),x);
        return true;
    }

    public void add(int idx, Integer x) {
        if (theItems.length == size()) {
            ensureCapacity(size()*2+1);
        }
        for (int i=size(); i>idx; i--) {
            theItems[i] = theItems[i-1];
            theItems[idx] = x;
        }
        theSize++;
    }

    public Integer remove(int idx) {
        if (idx<0 || idx>size()) {
            throw new IndexOutOfBoundsException();
        }
        Integer removeItem = theItems[idx];
        for (int i=idx; i<size(); i++) {
            theItems[i] = theItems[i+1];
        }
        theSize--;
        return removeItem;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ArraylistIterator();
    }

    //此处的ArrayListIterator是一个内部类。
    private class ArraylistIterator implements Iterator<Integer> {

        private int current = 0;

        @Override
        public boolean hasNext() {
            return current<size();
        }

        @Override
        public Integer next() {
            if(!hasNext()) {
                throw new NoSuchElementException();
            }
            return theItems[current++];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(--current);
        }
    }
}
