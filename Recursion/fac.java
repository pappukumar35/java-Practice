package Recursion;

import java.util.Scanner;

public class fac {
     public static int fact(int n) {
          if (n == 0) {
               return 1;
          }
          int fac = fact(n - 1);
          int fn = n * fact(n - 1);
          return fn;

     }

     public static void main(pp[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your number");
          int n = sc.nextInt();
          int result = fact(n);
          System.out.println(fact(n));

     }

}
