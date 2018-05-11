package com.github.grzegorzka.collection;

import java.util.Iterator;

public class LinkedListCollection1<T> implements BasicCollection<T> {

   class Node {
      T value;
      Node nextNode = null;
   }

   Node firstNode = null;
   Node lastNode = null;
   int x = 0;

   @Override
   public void add(T item) {
      Node node = new Node();
      node.value = item;
      if (firstNode == null) {
         firstNode = node;
         lastNode = node;
         x++;
      } else {
         lastNode.nextNode = node;
         lastNode = node;
         x++;
      }
   }

   @Override
   public boolean isEmpty() {
      return firstNode == null;
   }

   @Override
   public int size() {
      if (firstNode == null) {
         return 0;
      } else {
         return x;
      }
   }

   @Override
   public T get(int index) throws IndexOutOfBoundsException {
      if (firstNode == null || index < 0) {
         throw new IndexOutOfBoundsException(index);
      } else {
         Node indexNode = firstNode;

         for (int i = 0; i < index; i++) {
            if (indexNode == null) {
               throw new IndexOutOfBoundsException(index);
            }
            indexNode = indexNode.nextNode;
         }

         if (indexNode == null) {
            throw new IndexOutOfBoundsException(index);
         }

         return indexNode.value;
      }

   }

   @Override
   public Iterator<T> iterator() {
      if (true) throw new UnsupportedOperationException("Not implemented yet");
      return null;
   }
}
