package function2;

import java.util.*;

public class sum {
     public static int calculatedsum(int a, int b) {
          int sum = a + b;
          return sum;
     }

     public static void main(String[] args) {
          System.out.println("Enter your firs  number");
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          System.out.println("Enter your second  number");

          int b = sc.nextInt();
          int sum = calculatedsum(a, b);
          System.out.println("sum:" + sum);
     }
}
