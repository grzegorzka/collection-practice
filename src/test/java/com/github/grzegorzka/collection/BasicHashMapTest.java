package com.github.grzegorzka.collection;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class BasicHashMapTest {

  @Test
  public void testDictionary() {

    long start = System.currentTimeMillis();

    int itemCount = 1000000;

    BasicHashMap<String, LocalDate> map = new BasicHashMap<>(1000);

    assertEquals(0, map.size());
    assertTrue(map.isEmpty());

    LocalDate ld = LocalDate.now();

    map.put("akuku", ld);

    assertEquals(1, map.size());
    assertFalse(map.isEmpty());

    assertTrue(map.containsKey("akuku"));
    assertEquals(ld, map.get("akuku"));

    for (int i = 0; i < itemCount; i++) {
      map.put("akuku"+i, LocalDate.now());
    }

    assertEquals(itemCount + 1, map.size());
    assertTrue(map.containsKey("akuku1287"));

    map.remove("akuku1287");
    assertEquals(itemCount, map.size());
    assertFalse(map.containsKey("akuku1287"));

    long elapsed = System.currentTimeMillis() - start;

    System.out.println("Elapsed "+elapsed+" ms");

  }

}