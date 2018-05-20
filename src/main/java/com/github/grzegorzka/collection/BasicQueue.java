package com.github.grzegorzka.collection;

import java.util.NoSuchElementException;

public interface BasicQueue<T> {

   /**
    * Add object to end of the queue
    * @param object
    * @throws IllegalArgumentException if object is null
    */
   void add(T object) throws IllegalArgumentException;

   /**
    * Return object from beginning of the queue
    * @return first object or null if queue is empty
    */
   T peek();

   /**
    * Return object from beginning of the queue, and remove it from the queue
    * @throws NoSuchElementException if queue is empty
    */
   T pop() throws NoSuchElementException;

   /**
    * Return size of the queue
    */
   int size();

   /**
    * Return if queue is empty
    */
   boolean isEmpty();

}
