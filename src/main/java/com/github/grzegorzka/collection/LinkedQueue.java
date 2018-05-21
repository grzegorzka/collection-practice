package com.github.grzegorzka.collection;

import java.util.NoSuchElementException;

public class LinkedQueue<T> implements BasicQueue<T> {

    class Node {
        T value;
        Node nextNode = null;
    }

    Node firstNode = null;
    Node lastNode = null;
    int count = 0;

    @Override
    public void add(T object) throws IllegalArgumentException {
        if (object == null) {
            throw new IllegalArgumentException("object must be not null");
        } else {
            Node node = new Node();
            node.value = object;
            if (firstNode == null) {
                firstNode = node;
            } else {
                lastNode.nextNode = node;
            }
            lastNode = node;
            count ++;
        }
    }

    @Override
    public T peek() {
        if (firstNode == null) {
            return null;
        } else {
            return firstNode.value;
        }
    }

    @Override
    public T pop() throws NoSuchElementException {
        if (firstNode == null) {
            throw new NoSuchElementException();
        } else {
            T valueNode = firstNode.value;
            firstNode = firstNode.nextNode;
            count --;
            return valueNode;
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null;
    }
}
