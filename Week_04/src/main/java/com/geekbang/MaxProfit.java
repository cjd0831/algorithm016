package com.geekbang;

/**
 * 买卖股票的最佳时机
 */
public class MaxProfit {

  public int maxProfit(int[] prices) {
    //贪心算法
    int ans = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        ans += prices[i] - prices[i - 1];
      }
    }
    return ans;
  }
}
