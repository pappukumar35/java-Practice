package function2;

import java.util.*;

public class product {
     public static void print(int a, int b) {
          int temp = a;
          a = b;
          b = temp;
     }

     public static int multiply(int a, int b) {
          int product = a * b;
          return product;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = 10;
          int b = 20;
          int product = multiply(a, b);
          System.out.println("a*b:" + product);

     }
}
