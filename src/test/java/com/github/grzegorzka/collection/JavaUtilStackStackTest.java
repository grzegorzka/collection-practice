package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

public class JavaUtilStackStackTest extends BasicStackTest<Integer, JavaUtilStackStack<Integer>> {

   @Override
   protected JavaUtilStackStack<Integer> createEmptyStack() {
      return new JavaUtilStackStack<>();
   }

   @Override
   protected Integer createRandomItem() {
      return random.nextInt();
   }
}