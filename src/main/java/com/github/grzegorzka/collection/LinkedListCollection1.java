package com.github.grzegorzka.collection;

import java.util.Iterator;

// FIXME: merge with LinkedListCollection and remove LinkedListCollection1
public class LinkedListCollection1<T> implements BasicCollection<T> {

   class Node {
      T value;
      Node nextNode = null;
   }

   Node firstNode = null;
   Node lastNode = null;

   // FIXME: rename to count or itemCount
   int x = 0;

   @Override
   public void add(T item) {
      Node node = new Node();
      node.value = item;
      if (firstNode == null) {
         firstNode = node;
         lastNode = node;
         x++; // FIXME: incrementation is in 'if' and in 'else' branches - place it outside 'if'
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
         return 0; // FIXME: unneeded - x is initially 0
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
