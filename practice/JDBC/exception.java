package JDBC;

import java.util.*;

public class exception {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int dividend = sc.nextInt();
          int divisor = sc.nextInt();
          try {
               int result = dividend / divisor;
               System.out.println("your divisor is:" + result);
          } catch (ArithmeticException e) {
               System.out.println("divison is cann't be 0!!!");
          }

     }
}
