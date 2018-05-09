package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

public class JavaUtilArrayListCollectionTest extends
    BasicCollectionTest<Integer, JavaUtilArrayListCollection<Integer>> {

   @Override
   protected JavaUtilArrayListCollection<Integer> createEmptyCollection() {
      return new JavaUtilArrayListCollection<>();
   }

   @Override
   protected Integer createRandomItem() {
      return random.nextInt();
   }
}