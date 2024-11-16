package function2;

import java.util.*;

public class bio {
     public static int factorial(int n) {
          if (n == 0)
               return 1;
          else
               return n * factorial(n - 1);
     }

     public static int BinomialCoefficient(int n, int r) {
          int factorial_n = factorial(n);
          int factorial_r = factorial(r);
          int factorial_nmr = factorial(n - r);
          int binomialCoefficient = factorial_n / (factorial_r * factorial_nmr);
          return binomialCoefficient;
     }

     public static void main(String args[]) {
          System.out.println(BinomialCoefficient(4, 2));
     }
}
