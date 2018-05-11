package com.github.grzegorzka.collection;

// FIXME: remove
public class LinkedListCollectionTest1 extends BasicCollectionTest<Integer, LinkedListCollection1<Integer>> {

   @Override
   protected LinkedListCollection1<Integer> createEmptyCollection() {
      return new LinkedListCollection1<>();
   }

   @Override
   protected Integer createRandomItem() {
      return random.nextInt();
   }

   @Override
   public void iterator() {
      // FIXME: remove method
   }
}