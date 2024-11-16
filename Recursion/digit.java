package Recursion;

public class digit {
     public static int sod(int n) {
          if (n >= 0 && n <= 9) {
               return n;
          }
          int smallAns = sod(n / 10);
          int ans = smallAns + n % 10;
          return ans;
     }

     public static void main(pp[] args) {
          // System.out.println("Enter your number:");
          System.out.println(sod(10));
     }
}
