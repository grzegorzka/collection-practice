package com.github.grzegorzka.collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Random;
import org.junit.Test;

public abstract class BasicStackTest<T, C extends BasicStack<T>> {

   protected static Random random = new Random();

   protected abstract C createEmptyStack();

   protected abstract T createRandomItem();

   @Test
   public void isEmpty() {

      C stack = createEmptyStack();

      assertTrue("New collection must be empty", stack.isEmpty());

      stack.push(createRandomItem());

      assertFalse(stack.isEmpty());

   }

   @Test
   public void size() {

      C stack = createEmptyStack();
      assertEquals(0, stack.size());

      stack.push(createRandomItem());
      assertEquals(1, stack.size());

      int n = random.nextInt(900) + 100;

      for (int i = 0; i < n; i++) {
         stack.push(createRandomItem());
      }

      assertEquals(n + 1, stack.size());

   }

   @Test
   public void pushPeekPop() {

      C stack = createEmptyStack();

      try {
         stack.pop();
         fail("Should throw an exception");
      } catch (EmptyStackException e) {
         // ok
      }

      T firstElem = createRandomItem();
      T secondElem = createRandomItem();
      T thirdElem = createRandomItem();

      stack.push(firstElem);
      stack.push(secondElem);
      stack.push(thirdElem);

      assertEquals(thirdElem, stack.peek());
      assertEquals(thirdElem, stack.pop());
      assertEquals(secondElem, stack.peek());
      assertEquals(secondElem, stack.pop());
      assertEquals(firstElem, stack.peek());
      assertEquals(firstElem, stack.pop());

   }
}