package Recursion;

import java.util.Scanner;

public class Dec {
     public static void printDec(int n) {
          if (n == 1) {
               System.out.println(n);
               return;
          }
          System.out.println(n);
          printDec(n - 1);
     }

     public static void main(pp[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          printDec(n);
     }

}
