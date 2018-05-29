package com.github.grzegorzka.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BasicHashMap<K extends Comparable<K>, V> implements BasicDictionary<K, V> {

  private final Map<K, V>[] dataTable;
  private final int dataTableSize;

  private int size = 0;

  BasicHashMap(int tableSize) {
    dataTable = new Map[tableSize];
    dataTableSize = tableSize;
  }

  protected int computeHashValue(K key) {
    return Math.abs(key.hashCode()) % dataTableSize;
  }

  @Override
  public void put(K key, V value) {

    assert key != null;

    remove(key);

    int index = computeHashValue(key);

    Map<K, V> dataAtIndex = dataTable[index];

    if (dataAtIndex == null) {
      dataAtIndex = new HashMap<>();
      dataTable[index] = dataAtIndex;
    }

    dataAtIndex.put(key, value);

    size++;
  }

  @Override
  public boolean containsKey(K key) {
    int index = computeHashValue(key);
    Map<K, V> dataAtIndex = dataTable[index];
    if (dataAtIndex == null) {
      return false;
    }
    return dataAtIndex.containsKey(key);
  }

  @Override
  public V get(K key) {
    int index = computeHashValue(key);
    Map<K, V> dataAtIndex = dataTable[index];
    if (dataAtIndex == null) {
      throw new NoSuchElementException("Element not found");
    }
    if (dataAtIndex.containsKey(key)) {
      return dataAtIndex.get(key);
    }
    throw new NoSuchElementException("Element not found");
  }

  @Override
  public boolean remove(K key) {
    int index = computeHashValue(key);
    Map<K, V> dataAtIndex = dataTable[index];
    if (dataAtIndex == null) {
      return false;
    }
    if (dataAtIndex.remove(key) != null) {
      size--;
      return true;
    }
    return false;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }
}
