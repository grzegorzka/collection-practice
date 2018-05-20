package com.github.grzegorzka.collection;

import java.util.Iterator;

public class LinkedListCollection<T> implements BasicCollection<T> {

   class Node {
      T value;
      Node nextNode = null;
   }

   Node firstNode = null;
   Node lastNode = null;

   int count = 0;

   @Override
   public void add(T item) {
      Node node = new Node();
      node.value = item;
      if (firstNode == null) {
         firstNode = node;
         lastNode = node;
      } else {
         lastNode.nextNode = node;
         lastNode = node;
      }
      count++;
   }

   @Override
   public boolean isEmpty() {
      return firstNode == null;
   }

   @Override
   public int size() {
      return count;
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
   public void clear() {
      firstNode = null;
      lastNode = null;
      count = 0;
   }

   @Override
   public T remove(int index) throws IndexOutOfBoundsException {
      if (firstNode == null || index < 0 || index >= count) {
         throw new IndexOutOfBoundsException(index);
      } else {
         T valueIndexNode = get(index);
         if (index == 0) {
            Node indexNode = firstNode;
            firstNode = firstNode.nextNode;
         } else {
            if (index == count-1) {
               Node indexNode = lastNode;
               lastNode = null;
            } else {
               Node preIndexNode = firstNode;
               Node postIndexNode = firstNode.nextNode.nextNode;
               for (int i = 0; i < index - 1 ; i++){
                  preIndexNode = preIndexNode.nextNode;
                  postIndexNode = postIndexNode.nextNode;
               }
               preIndexNode.nextNode = postIndexNode;
            }

         }
         count --;
         return valueIndexNode;
      }

   }

}
