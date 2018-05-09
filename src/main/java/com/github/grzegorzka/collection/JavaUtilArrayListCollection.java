package com.github.grzegorzka.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaUtilArrayListCollection<T> implements BasicCollection<T> {

   private List<T> internalList = new ArrayList<>();

   @Override
   public void add(T item) {
      internalList.add(item);
   }

   @Override
   public boolean isEmpty() {
      return internalList.isEmpty();
   }

   @Override
   public int size() {
      return internalList.size();
   }

   @Override
   public T get(int index) throws IndexOutOfBoundsException {
      return internalList.get(index);
   }

   @Override
   public Iterator<T> iterator() {
      return internalList.iterator();
   }
}
