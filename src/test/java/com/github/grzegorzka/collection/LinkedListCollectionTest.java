package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListCollectionTest extends BasicCollectionTest<Integer, LinkedListCollection<Integer>> {

   @Override
   protected LinkedListCollection<Integer> createEmptyCollection() {
      return new LinkedListCollection<>();
   }

   @Override
   protected Integer createRandomItem() {
      return random.nextInt();
   }

}