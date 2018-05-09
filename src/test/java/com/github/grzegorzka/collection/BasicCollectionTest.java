package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.junit.Test;

public abstract class BasicCollectionTest<T, C extends BasicCollection<T>> {

   protected static Random random = new Random();

   protected abstract C createEmptyCollection();

   protected abstract T createRandomItem();

   @Test
   public void isEmpty() {

      C collection = createEmptyCollection();

      assertTrue("New collection must be empty", collection.isEmpty());

      collection.add(createRandomItem());

      assertFalse(collection.isEmpty());

   }

   @Test
   public void size() {

      C collection = createEmptyCollection();
      assertEquals(0, collection.size());

      collection.add(createRandomItem());
      assertEquals(1, collection.size());

      int n = random.nextInt(900) + 100;

      for (int i = 0; i < n; i++) {
         collection.add(createRandomItem());
      }

      assertEquals(n + 1, collection.size());

   }

   @Test
   public void addAndGet() {

      C collection = createEmptyCollection();

      try {
         collection.get(0);
         fail("Should throw an exception");
      } catch (IndexOutOfBoundsException e) {
         // ok
      }

      T firstElem = createRandomItem();
      T secondElem = createRandomItem();

      collection.add(firstElem);
      collection.add(secondElem);

      assertEquals(firstElem, collection.get(0));
      assertEquals(secondElem, collection.get(1));

      int size = random.nextInt(80) + 20;
      List<T> workingList = new ArrayList<>(size);
      collection = createEmptyCollection();
      for (int i = 0; i < size; i++) {
         T item = createRandomItem();
         workingList.add(item);
         collection.add(item);
      }

      for (int i = 0; i < size; i++) {
         assertEquals(workingList.get(i), collection.get(i));
      }
      try {
         collection.get(size);
         fail("Should throw an exception");
      } catch (IndexOutOfBoundsException e) {
         // ok
      }

   }

   @Test
   public void iterator() {
      // FIXME: implement test
   }
}