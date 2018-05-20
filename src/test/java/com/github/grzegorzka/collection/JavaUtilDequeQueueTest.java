package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

public class JavaUtilDequeQueueTest extends BasicQueueTest<Integer, JavaUtilDequeQueue<Integer>> {

    @Override
    protected JavaUtilDequeQueue<Integer> createEmptyQueue() {
        return new JavaUtilDequeQueue<>();
    }

    @Override
    protected Integer createRandomItem() {
        return random.nextInt();
    }
}