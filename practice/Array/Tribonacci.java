package Array;

public class Tribonacci {
     public int tribonacci(int n) {
          if (n < 2) {
               return n;
               int[] dp = { 0, 1, 1 };
               for (int i = 3; i <= n; i++) {
                    final int text = dp[0] + dp[1] + dp[2];
                    dp[0] = dp[1];
                    dp[1] = dp[2];
                    dp[2] = text;
               }
               return dp[2];
          }
     }

     public static void main(String[] args) {

     }
}