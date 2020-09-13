package com.geekbang;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  /**
   * 两数之和
   *
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>(16);
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[]{map.get(target - nums[i]), nums[i]};
      }
      map.put(nums[i], i);
    }

    throw new IllegalArgumentException("没有两数之和等于目标值");
  }
}
