package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

public class LinkedQueueTest extends BasicQueueTest<Integer, LinkedQueue<Integer>> {

    @Override
    protected LinkedQueue<Integer> createEmptyQueue() {
        return new LinkedQueue<>();
    }

    @Override
    protected Integer createRandomItem() {
        return random.nextInt();
    }
}