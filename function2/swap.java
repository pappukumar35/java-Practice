package function2;

import java.util.*;

public class swap {
     public static int caluclatedSwap(int a, int b) {
          int sum = a + b;
          return sum;
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = 10;
          int b = 15;
          int temp = a;
          a = b;
          b = temp;
          System.out.println("a:" + a);
          System.out.println("b:" + b);

     }
}
