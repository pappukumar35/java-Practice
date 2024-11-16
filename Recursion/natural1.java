package Recursion;

import java.util.Scanner;

public class natural1 {
     public static void printInc(int n) {
          if (n == 1) {
               System.out.println(n);
               return;
          }
          printInc(n - 1);
          System.out.println(n);
     }

     public static void main(pp[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          printInc(n);

     }

}