package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

public class LinkedStackTest extends BasicStackTest<Integer, LinkedStack<Integer>> {

    @Override
    protected LinkedStack<Integer> createEmptyStack() {
        return new LinkedStack<>();
    }

    @Override
    protected Integer createRandomItem() {
        return random.nextInt();
    }
}