package Array;

public class fib {
     public int fib(int n) {
          if (n == 0) {
               return 0;
          } else if (n == 1) {
               return 1;
          }
          int firstTerm = 0;
          int secondTerm = 1;
          for (int i = 1; i <= n; i++) {
               int thirdterm = firstTerm + secondTerm;
               firstTerm = secondTerm;
               secondTerm = thirdterm;
          }
          return firstTerm;
     }

     public static void main(String[] args) {

     }
}