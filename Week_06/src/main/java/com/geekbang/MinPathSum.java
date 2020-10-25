package com.geekbang;

/**
 * 最小路径和
 */
public class MinPathSum {

  public int minPathSum(int[][] grid) {
    //动态规划
    int m = grid.length;
    if (m == 0) {
      return 0;
    }
    int n = grid[0].length;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 && j == 0) {
          continue;
        }

        if (i == 0) {
          grid[i][j] = grid[i][j - 1] + grid[i][j];
        } else if (j == 0) {
          grid[i][j] = grid[i - 1][j] + grid[i][j];
        } else {
          grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
        }
      }
    }
    return grid[m - 1][n - 1];
  }
}
