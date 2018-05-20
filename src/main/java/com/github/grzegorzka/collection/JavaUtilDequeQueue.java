package com.github.grzegorzka.collection;

import java.util.Deque;
import java.util.LinkedList;

public class JavaUtilDequeQueue<T> implements BasicQueue<T> {

   private Deque<T> deque = new LinkedList<>();

   @Override
   public void push(T object) throws IllegalArgumentException {
      deque.push(object);
   }

   @Override
   public T peek() {
      return deque.peek();
   }

   @Override
   public T pop() {
      return deque.pop();
   }

   @Override
   public int size() {
      return deque.size();
   }

   @Override
   public boolean isEmpty() {
      return deque.isEmpty();
   }
}
