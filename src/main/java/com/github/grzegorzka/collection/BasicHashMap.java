package com.github.grzegorzka.collection;

import java.util.NoSuchElementException;

public class BasicHashMap<K extends Comparable<K>, V> implements BasicDictionary<K, V> {

  private final BasicCollection<Pair<K, V>>[] dataTable;
  private final int dataTableSize;

  private int size = 0;

  BasicHashMap(int tableSize) {
    dataTable = new BasicCollection[tableSize];
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

    BasicCollection<Pair<K, V>> dataAtIndex = dataTable[index];

    if (dataAtIndex == null) {
      dataAtIndex = new LinkedListCollection<>();
      dataTable[index] = dataAtIndex;
    }

    dataAtIndex.add(new Pair<>(key, value));

    size++;
  }

  @Override
  public boolean containsKey(K key) {
    int index = computeHashValue(key);
    BasicCollection<Pair<K, V>> dataAtIndex = dataTable[index];
    if (dataAtIndex == null) {
      return false;
    }
    for (int i = 0; i < dataAtIndex.size(); i++) {
      if (dataAtIndex.get(i).getFirst().compareTo(key) == 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public V get(K key) {
    int index = computeHashValue(key);
    BasicCollection<Pair<K, V>> dataAtIndex = dataTable[index];
    if (dataAtIndex == null) {
      throw new NoSuchElementException("Element not found");
    }
    for (int i = 0; i < dataAtIndex.size(); i++) {
      Pair<K, V> dataPair = dataAtIndex.get(i);
      if (dataPair.getFirst().compareTo(key) == 0) {
        return dataPair.getSecond();
      }
    }
    throw new NoSuchElementException("Element not found");
  }

  @Override
  public boolean remove(K key) {
    int index = computeHashValue(key);
    BasicCollection<Pair<K, V>> dataAtIndex = dataTable[index];
    if (dataAtIndex == null) {
      return false;
    }
    for (int i = 0; i < dataAtIndex.size(); i++) {
      Pair<K, V> dataPair = dataAtIndex.get(i);
      if (dataPair.getFirst().compareTo(key) == 0) {
        dataAtIndex.remove(i);
        size--;
        return true;
      }
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
