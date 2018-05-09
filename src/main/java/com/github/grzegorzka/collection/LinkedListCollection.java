package com.github.grzegorzka.collection;

import java.util.Iterator;

public class LinkedListCollection<T> implements BasicCollection<T> {

   class Node {
      T value;
      Node nextNode;
   }

   Node firstNode = null;

   @Override
   public void add(T item) {
      throw new UnsupportedOperationException("Not implemented yet");
   }

   @Override
   public boolean isEmpty() {
      if (true) throw new UnsupportedOperationException("Not implemented yet");
      return false;
   }

   @Override
   public int size() {
      if (true) throw new UnsupportedOperationException("Not implemented yet");
      return 0;
   }

   @Override
   public T get(int index) throws IndexOutOfBoundsException {
      if (true) throw new UnsupportedOperationException("Not implemented yet");
      return null;
   }

   @Override
   public Iterator<T> iterator() {
      if (true) throw new UnsupportedOperationException("Not implemented yet");
      return null;
   }
}
