package com.github.grzegorzka.collection;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements BasicQueue<T> {

    @Override
    public void add(T object) throws IllegalArgumentException {

    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T pop() throws NoSuchElementException {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
