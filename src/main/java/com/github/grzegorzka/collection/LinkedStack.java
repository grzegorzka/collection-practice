package com.github.grzegorzka.collection;

import java.util.EmptyStackException;


public class LinkedStack<T> implements BasicStack<T> {

    class Node {
        T value;
        Node nextNode = null;
    }

    Node firstNode = null;
    int count = 0;

    @Override
    public void push(T object) throws IllegalArgumentException {
        if (object == null) {
            throw new IllegalArgumentException("object must be not null");
        } else {
            Node node = new Node();
            node.value = object;
            if (firstNode == null) {
                firstNode = node;
            } else {
                node.nextNode = firstNode;
                firstNode = node;
            }
            count++;
        }
    }

    @Override
    public T peek() throws EmptyStackException {
        if (firstNode == null) {
            throw new EmptyStackException();
        } else {
            return firstNode.value;
        }
    }

    @Override
    public T pop() throws EmptyStackException {
        if (firstNode == null) {
            throw new EmptyStackException();
        } else {
            T nodeValue = firstNode.value;
            firstNode = firstNode.nextNode;
            count--;
            return nodeValue;
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
