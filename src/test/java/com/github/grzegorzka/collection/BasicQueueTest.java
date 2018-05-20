package com.github.grzegorzka.collection;

import org.junit.Test;

import java.util.NoSuchElementException;
import java.util.Random;

import static org.junit.Assert.*;

public abstract class BasicQueueTest<T, C extends BasicQueue<T>> {

   protected static Random random = new Random();

   protected abstract C createEmptyQueue();

   protected abstract T createRandomItem();

   @Test
   public void isEmpty() {

      C queue = createEmptyQueue();

      assertTrue("New collection must be empty", queue.isEmpty());

      queue.add(createRandomItem());

      assertFalse(queue.isEmpty());

   }

   @Test
   public void size() {

      C queue = createEmptyQueue();
      assertEquals(0, queue.size());

      queue.add(createRandomItem());
      assertEquals(1, queue.size());

      int n = random.nextInt(900) + 100;

      for (int i = 0; i < n; i++) {
         queue.add(createRandomItem());
      }

      assertEquals(n + 1, queue.size());

      int m = random.nextInt(90) + 10;

      for (int i = 0; i < m; i++) {
         queue.pop();
      }

      assertEquals(n + 1 - m, queue.size());
   }

   @Test
   public void addPeekPop() {

      C queue = createEmptyQueue();

      try {
         queue.pop();
         fail("Should throw an exception");
      } catch (NoSuchElementException e) {
         // ok
      }

      assertNull(queue.peek());

      T firstElem = createRandomItem();
      T secondElem = createRandomItem();
      T thirdElem = createRandomItem();

      queue.add(firstElem);
      queue.add(secondElem);
      queue.add(thirdElem);

      assertEquals(firstElem, queue.peek());
      assertEquals(firstElem, queue.pop());
      assertEquals(secondElem, queue.peek());
      assertEquals(secondElem, queue.pop());
      assertEquals(thirdElem, queue.peek());
      assertEquals(thirdElem, queue.pop());

      assertTrue(queue.isEmpty());
   }
}