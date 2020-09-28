package com.geekbang;

import java.util.ArrayList;
import java.util.List;

/**
 * 全排列
 */
public class Permute {

  public List<List<Integer>> permute(int[] nums) {
    int len = nums.length;
    List<List<Integer>> ans = new ArrayList<>();
    if (len == 0) {
      return ans;
    }
    boolean[] used = new boolean[len];
    List<Integer> path = new ArrayList<>();
    dfs(nums, len, 0, used, path, ans);
    return ans;
  }

  public void dfs(int[] nums, int len, int depth, boolean[] used, List<Integer> path,
      List<List<Integer>> ans) {
    if (depth == len) {
      ans.add(new ArrayList<>(path));
      return;
    }
    for (int i = 0; i < len; i++) {
      if (!used[i]) {
        path.add(nums[i]);
        used[i] = true;
        dfs(nums, len, depth + 1, used, path, ans);
        used[i] = false;
        path.remove(path.size() - 1);
      }
    }
  }
}
