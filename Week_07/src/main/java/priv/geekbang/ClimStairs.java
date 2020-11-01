package priv.geekbang;

public class ClimStairs {

  public int climbStairs(int n) {
    int first = 0, second = 0, third = 1;
    for (int i = 1; i <= n; i++) {
      first = second;
      second = third;
      third = first + second;
    }
    return third;
  }
}
