package com.github.grzegorzka.collection;

import java.util.Stack;

public class JavaUtilStackStack<T> implements BasicStack<T> {

   private Stack<T> stack = new Stack<>();

   @Override
   public void push(T object) throws IllegalArgumentException {
      stack.push(object);
   }

   @Override
   public T peek() {
      return stack.peek();
   }

   @Override
   public T pop() {
      return stack.pop();
   }

   @Override
   public int size() {
      return stack.size();
   }

   @Override
   public boolean isEmpty() {
      return stack.isEmpty();
   }
}
