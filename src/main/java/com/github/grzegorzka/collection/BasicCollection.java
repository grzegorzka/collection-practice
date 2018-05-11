package com.github.grzegorzka.collection;

import java.util.Iterator;

public interface BasicCollection<T> {

   /**
    * Adds item at end of collection
    * @param item item to be added
    */
   void add(T item);

   /**
    * Returns true if collection is empty
    */
   boolean isEmpty();

   /**
    * Returns number of items in collection
    * @return number of items in collection
    */
   int size();

   /**
    * Returns index'th element from start of the collection
    * @param index index of element to return (0-based)
    * @throws IndexOutOfBoundsException if index is out of range
    * @return element at index'th position in the collection
    */
   T get(int index) throws IndexOutOfBoundsException;

   /**
    * Returns {@link Iterator} over the collection
    */
   Iterator<T> iterator();

   /**
    * Removes all elements from collection
    */
   void clear();

   /**
    * Removes index'th element of collection, returning it
    * @param index index of element to remove
    * @return removed element
    * @throws IndexOutOfBoundsException if index is invalid (negative or too big)
    */
   T remove(int index) throws IndexOutOfBoundsException;

}
