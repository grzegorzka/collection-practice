package com.github.grzegorzka.collection;

import java.util.EmptyStackException;

public interface BasicStack<T> {

   /**
    * Add object to top of the stack
    * @param object
    * @throws IllegalArgumentException if object is null
    */
   void push(T object) throws IllegalArgumentException;

   /**
    * Return object from top of the stack. Does not remove the object.
    */
   T peek() throws EmptyStackException;

   /**
    * Return object from top of the stack, and remove it from the stack
    */
   T pop() throws EmptyStackException;

   /**
    * Return size of the stack
    */
   int size();

   /**
    * Return if stack is empty
    */
   boolean isEmpty();

}
