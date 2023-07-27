

public class Kata_001 {
  public static int sumMul(int n, int m) {
      if (n <= 0 || m < 0) {
          throw new IllegalArgumentException("Both n and m should be positive integers.");
      }

      int sum = 0;
      for (int i = n; i < m; i += n) {
          sum += i;
      }
      return sum;
  }
}