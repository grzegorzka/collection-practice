package com.github.grzegorzka.collection;

public interface BasicDictionary<K extends Comparable<K>, V> {

  void put(K key, V value);

  boolean containsKey(K key);

  V get(K key);

  boolean remove(K key);

  int size();

  boolean isEmpty();

}
