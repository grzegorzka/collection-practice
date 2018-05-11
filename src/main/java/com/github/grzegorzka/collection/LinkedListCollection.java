package com.github.grzegorzka.collection;

import java.util.Iterator;

public class LinkedListCollection<T> implements BasicCollection<T> {

   class Node {
      T value;
      Node nextNode = null;
   }

   Node firstNode = null;

   @Override
   public void add(T item) {
      Node node = new Node();
      node.value = item;
      if (firstNode == null) {
         firstNode = node;
      } else {
         Node lastNode = firstNode;
         while (lastNode.nextNode != null) {
            lastNode = lastNode.nextNode;
         }
         lastNode.nextNode = node;
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
         Node lastNode = firstNode;
         int x = 0;
         while (lastNode != null) {
            lastNode = lastNode.nextNode;
            x++;
         }
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

   @Override
   public void clear() {
      // FIXME: implement
   }

   @Override
   public T remove(int index) throws IndexOutOfBoundsException {
      return null; // FIXME: implement
   }
}
