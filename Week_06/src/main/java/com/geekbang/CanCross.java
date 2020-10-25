package com.geekbang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 青蛙过河
 */
public class CanCross {

  public boolean canCross(int[] stones) {
    HashMap<Integer, Set<Integer>> map = new HashMap<>();
    for (int stone : stones) {
      map.put(stone, new HashSet<>());
    }
    map.get(0).add(0);
    for (int stone : stones) {
      for (int k : map.get(stone)) {
        for (int step = k - 1; step <= k + 1; step++) {
          if (step > 0 && map.containsKey(stone + step)) {
            map.get(stone + step).add(step);
          }
        }
      }
    }
    return map.get(stones[stones.length - 1]).size() > 0;
  }
}
