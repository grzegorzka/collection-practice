package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

public class LinkedListCollectionTest extends BasicCollectionTest<Integer, LinkedListCollection<Integer>> {

   @Override
   protected LinkedListCollection<Integer> createEmptyCollection() {
      return new LinkedListCollection<>();
   }

   @Override
   protected Integer createRandomItem() {
      return random.nextInt();
   }

   @Override
   public void isEmpty() {
      // FIXME: remove method
   }

   @Override
   public void size() {
      // FIXME: remove method
   }

   @Override
   public void addAndGet() {
      // FIXME: remove method
   }

   @Override
   public void iterator() {
      // FIXME: remove method
   }
}